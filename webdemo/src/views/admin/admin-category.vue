<template>

  <a-layout>
    <a-layout-content
        :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
    >
      <!--      <P>DIAN ZISHU</P>-->
      <p><a-button type="primary" size="large" @click="addContet()">新增</a-button></p>
      <p>
        <a-input-search
            v-model:value="value"
            placeholder="input search text"
            enter-button="查询"
            @search="onSearch"
            style="width: 200px"
            size = 'default'
        />
      </p>
      <!--      <p>-->
      <!--&lt;!&ndash; //新增是没有参数的所有可以清空addContet()&ndash;&gt;-->
      <!--        <a-button type="primary" @click="addContet()" size="large">新增</a-button>-->
      <!--      </p>-->

      <a-table
          :columns="columns"
          :row-key="record => record.id"
          :data-source="categorys"
          :pagination="pagination"
          :loading="loading"
          @change="handleTableChange"
      >
        <template #cover="{ text: cover }">
          <img v-if="cover" :src="cover" alt="avatar" height="35" width="35"/>
        </template>
        <template v-slot:action="{ text, record }">

          <a-space size="small">
            <a-button type="primary" @click="edit(record)">编辑</a-button>
            <a-button type="primary" @click="showDeleteConfirm(record.id)">删除</a-button>
            <a-button type="primary" @click="addContet()">新增</a-button>
          </a-space>



          <a-modal
              v-model:visible="visible"
              title="Title"
              :confirm-loading="confirmLoading"
              @ok="handleOk"
          >
            <p>{{ modalText }}</p>
            <a-form
                :model="category"
                name="basic"
                :label-col="{ span: 8 }"
                :wrapper-col="{ span: 16 }"
                autocomplete="off"
                @finish="onFinish"
                @finishFailed="onFinishFailed"
            >
              <a-form-item
                  label="名称"
                  name="名称"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="category.cover" />
              </a-form-item>
              <a-form-item
                  label="父分类"
                  name="父分类"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="category.category" />
              </a-form-item>
              <a-form-item
                  label="排序"
                  name="排序"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="category.description" />
              </a-form-item>
              <a-form-item
                  label="id"
                  name="id"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="category.id" />
              </a-form-item>

            </a-form>
          </a-modal>










        </template>
        <template #headerCell="{ column }">
          <template v-if="column.key === 'cover'">
        <span>
          <smile-outlined />
          名称
        </span>
          </template>
        </template>
        <template #bodyCell="{ column, record }">
          <template v-if="column.key === 'name'">
            <a>
              {{ record.name }}
            </a>
          </template>

        </template>



      </a-table>

    </a-layout-content>


  </a-layout>





</template>
<script lang="ts">

import {createVNode, defineComponent,onMounted,ref } from 'vue';
import axios from "axios";
import {ExclamationCircleOutlined} from "@ant-design/icons-vue";
import {Modal} from "ant-design-vue";
import {message} from "ant-design-vue";

export default defineComponent({
  name: 'AdminCategory',
  setup() {

    const categorys = ref();
    const pagination = ref({
      current: 1,
      pageSize: 10,
      total: 0
    });
    const loading = ref(false);

    const columns = [
      {
        title: 'id',
        dataIndex: 'id',
        slots: { customRender: 'id' },
        key: 'id',
      },
      {
        title: '名称',
        dataIndex: 'name',
        key: 'name',
      },
      {
        title: '父分类',
        dataIndex:'parent',
        slots: { customRender: 'parent' },
        key: 'parent',
      },
      {
        title: '排序',
        dataIndex:'sort',
        key: 'sort',
      },
      {
        title: 'Action',
        key: 'action',
        slots: { customRender: 'action' },

      },

    ];




    /**
     * 数据查询
     **/
    const handleQuery = (params: any) => {
      loading.value = true;
      axios.get("/test/category", {
        params: {
          page: params.page,
          size: params.size
        }
      }).then((response) => {
        loading.value = false;
        const data = response.data;
        if (data.success) {

          categorys.value = data.content.list;

          // 重置分页按钮
          pagination.value.current = params.page;
          pagination.value.total = data.content.total;
        }else {
          message.error(data.message);
        }
      });
    };

    /**
     * 表格点击页码时触发
     */
    const handleTableChange = (pagination: any) => {
      console.log("看看自带的分页参数都有啥：" + pagination);
      handleQuery({
        page: pagination.current,
        size: pagination.pageSize
      });
    };

    const showDeleteConfirm = (id:number) => {
      Modal.confirm({
        title: 'Are you sure delete this task?',
        icon: createVNode(ExclamationCircleOutlined),
        content: 'Some descriptions',
        okText: 'Yes',
        okType: 'danger',
        cancelText: 'No',
        onOk() {

          axios.delete("/test/delete/" + id).then((response) => {
            const data = response.data;
            if (data.success) {

              // 重新加载数据
              handleQuery({
                page: pagination.value.current,
                size: pagination.value.pageSize,
              });
            }

          }).catch(() => console.log('Oops errors!'));
          // console.log('OK');
          //
          //
          // axios.delete("/test/delete/" + id).then((response) => {
          //   const data = response.data;
          //   if (data.success) {
          //
          //     // 重新加载数据
          //     handleQuery({
          //       page: pagination.value.current,
          //       size: pagination.value.pageSize,
          //     });
          //   }


        },
        onCancel() {
          console.log('Cancel');
        },
      })
    };


    onMounted(() => {
      handleQuery({
        page: 1,
        size: pagination.value.pageSize,
      });
    });

    //按钮 增加弹窗
    //表单 category 数据获取
    const category = ref({});

    const modalText = ref<string>('Content of the modal');
    const visible = ref<boolean>(false);
    const confirmLoading = ref<boolean>(false);

    const edit = (record:any) => {
      visible.value = true;
      //表单数据添加进来 加入参数  record
      category.value = record;
    };

    const addContet = () =>{
      visible.value = true;
      category.value = {};//没有数据就用{}
    }

    const handleOk = () => {
      confirmLoading.value = true;
      modalText.value = 'The modal will be closed after two seconds';
      axios.post("/test/saveInfList",category.value).then((response) => {
        confirmLoading.value = false;
        const data = response.data;
        if(data.success){
          visible.value = false;
          //confirmLoading.value = false;

          // 重新加载数据
          handleQuery({
            page: pagination.value.current,
            size: pagination.value.pageSize,


      });
        }else {
          message.error(data.message);
        }

      });

    };




    return {

      categorys,
      pagination,
      columns,
      loading,
      handleTableChange,
      showDeleteConfirm,


      modalText,
      visible,
      confirmLoading,
      category,

      handleOk,
      edit,
      addContet,




    }
  }
});

</script>
<style scoped>
img {
  width: 50px;
  height: 50px;
}
</style>
