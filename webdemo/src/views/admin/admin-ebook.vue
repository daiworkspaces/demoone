<template>

  <a-layout>
    <a-layout-content
        :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
    >
      <P>DIAN ZISHU</P>
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
            <a-button type="danger" @click="del">删除</a-button>
          </a-space>
          <a-modal
              v-model:visible="visible"
              title="Title"
              :confirm-loading="confirmLoading"
              @ok="handleOk"
          >
            <p>{{ modalText }}</p>
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

export default defineComponent({
  name: 'AdminEbook',
  setup() {

    const ebooks = ref();
    const pagination = ref({
      current: 1,
      pageSize: 3,
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
        ebooks.value = data.content.list;

        // 重置分页按钮
        pagination.value.current = params.page;
        pagination.value.total = data.content.total;
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





    onMounted(() => {
      handleQuery({
        page: 1,
        size: pagination.value.pageSize,
      });
    });

    //按钮 增加弹窗
    const modalText = ref<string>('Content of the modal');
    const visible = ref<boolean>(false);
    const confirmLoading = ref<boolean>(false);

    const edit = () => {
      visible.value = true;
    };
    const del = () => {
      visible.value = true;

    }

    const handleOk = () => {
      modalText.value = 'The modal will be closed after two seconds';
      confirmLoading.value = true;
      setTimeout(() => {
        visible.value = false;
        confirmLoading.value = false;
      }, 2000);
    };




    return {

      ebooks,
      pagination,
      columns,
      loading,
      handleTableChange,


      modalText,
      visible,
      confirmLoading,

      handleOk,
      edit,
      del



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
