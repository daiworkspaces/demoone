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
          :data-source="ebooks"
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
                :model="ebook"
                name="basic"
                :label-col="{ span: 8 }"
                :wrapper-col="{ span: 16 }"
                autocomplete="off"
                @finish="onFinish"
                @finishFailed="onFinishFailed"
            >
              <a-form-item
                  label="封面"
                  name="封面"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="ebook.cover" />
              </a-form-item>

              <a-form-item
                  label="分类"
                  name="分类"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="ebook.category" />
              </a-form-item>
              <a-form-item
                  label="描述"
                  name="描述"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="ebook.description" />
              </a-form-item>

              <a-form-item
                  label="名称"
                  name="名称"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="ebook.name" />
              </a-form-item>

              <a-form-item
                  label="文档数"
                  name="文档数"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="ebook.docCount" />
              </a-form-item>

              <a-form-item
                  label="阅读数"
                  name="阅读数"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="ebook.viewCount" />
              </a-form-item>

              <a-form-item
                  label="点赞数"
                  name="点赞数"
                  :rules="[{ required: false, message: 'Please input your username!' }]"
              >
                <a-input v-model:value="ebook.voteCount" />
              </a-form-item>


              <!--              <a-form-item :wrapper-col="{ offset: 8, span: 16 }">-->
              <!--                <a-button type="primary" html-type="submit">Submit</a-button>-->
              <!--              </a-form-item>-->
            </a-form>
          </a-modal>










        </template>
        <template #headerCell="{ column }">
          <template v-if="column.key === 'cover'">
        <span>
          <smile-outlined />
          封面
        </span>
          </template>
        </template>
        <template #bodyCell="{ column, record }">
          <template v-if="column.key === 'name'">
            <a>
              {{ record.name }}
            </a>
          </template>
          <template v-else-if="column.key === 'tags'">
        <span>
          <a-tag
              v-for="tag in record.tags"
              :key="tag"
              :color="tag === 'loser' ? 'volcano' : tag.length > 5 ? 'geekblue' : 'green'"
          >
            {{ tag.toUpperCase() }}
          </a-tag>
        </span>
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
  name: 'AdminEbook',
  setup() {

    const ebooks = ref();
    const pagination = ref({
      current: 1,
      pageSize: 10,
      total: 0
    });
    const loading = ref(false);

    const columns = [
      {
        title: '封面',
        dataIndex: 'cover',
        slots: { customRender: 'cover' },
        key: 'cover',
      },
      {
        title: '名称',
        dataIndex: 'name',
        key: 'name',
      },
      {
        title: '分类',
        dataIndex:'category',
        slots: { customRender: 'category' },
        key: 'category',
      },
      {
        title: '描述',
        dataIndex:'description',
        key: 'description',
      },

      {
        title: '文档数',
        dataIndex: 'docCount',
        key: 'docCount',
      },
      {
        title: '阅读数',
        dataIndex: 'viewCount',
        key: 'viewCount',
      },
      {
        title: '点赞数',
        dataIndex: 'voteCount',
        key: 'voteCount',
      },
      {
        title: 'Action',
        key: 'action',
        slots: { customRender: 'action' },

      }
    ];
    const data = [
      {
        key: '1',
        cover: '/image/cover1.png',
        name: 'TS入门',
        category: '1',
        docCount:'1',
        viewCount:'2',
        voteCount:'3'
      },
      {
        key: '2',
        cover: '/image/cover2.png',
        name: 'JS入门',
        category: '2',
        docCount:'1',
        viewCount:'2',
        voteCount:'3'
      },

    ];



    /**
     * 数据查询
     **/
    const handleQuery = (params: any) => {
      loading.value = true;
      axios.get("test/infList", {
        params: {
          page: params.page,
          size: params.size
        }
      }).then((response) => {
        loading.value = false;
        const data = response.data;
        if (data.success) {

          ebooks.value = data.content.list;

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
    //表单 ebook 数据获取
    const ebook = ref({});

    const modalText = ref<string>('Content of the modal');
    const visible = ref<boolean>(false);
    const confirmLoading = ref<boolean>(false);

    const edit = (record:any) => {
      visible.value = true;
      //表单数据添加进来 加入参数  record
      ebook.value = record;
    };

    const addContet = () =>{
      visible.value = true;
      ebook.value = {};//没有数据就用{}
    }

    const handleOk = () => {
      confirmLoading.value = true;
      modalText.value = 'The modal will be closed after two seconds';
      axios.post("/test/saveInfList",ebook.value).then((response) => {
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

      ebooks,
      pagination,
      columns,
      loading,
      handleTableChange,
      showDeleteConfirm,


      modalText,
      visible,
      confirmLoading,
      ebook,

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
