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
          :data-source="data"
          :pagination="pagination"
          :loading="loading"
          @change="handleTableChange"
      >
        <template #cover="{ text: cover }">
          <img v-if="cover" :src="cover" alt="avatar" height="35" width="35"/>
        </template>
        <template v-slot:action="{ text, record }">
          <a-space size="small">
            <router-link :to="'/admin/doc?ebookId=' + record.id">
              <a-button type="primary">
                文档管理
              </a-button>
            </router-link>
            <a-button type="primary" @click="edit(record)">
              编辑
            </a-button>
            <a-popconfirm
                title="删除后不可恢复，确认删除?"
                ok-text="是"
                cancel-text="否"
                @confirm="handleDelete(record.id)"
            >
              <a-button type="danger">
                删除
              </a-button>
            </a-popconfirm>
          </a-space>
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
import { SmileOutlined, DownOutlined } from '@ant-design/icons-vue';
import { defineComponent,ref } from 'vue';

export default defineComponent({
  name: 'AdminEbook',
  setup() {
    const param = ref();
    param.value = {};
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

    const level1 =  ref();
    let categorys: any;

    const getCategoryName = (cid: number) => {
      // console.log(cid)
      let result = "";
      categorys.forEach((item: any) => {
        if (item.id === cid) {
          // return item.name; // 注意，这里直接return不起作用
          result = item.name;
        }
      });
      return result;
    };
    const SERVER = process.env.VUE_APP_SERVER;
    const fileList = ref([]);
    const coverLoading = ref<boolean>(false);
    const imageUrl = ref<string>('');

    const handleChange = (info: any) => {
      if (info.file.status === 'upcoverLoading') {
        coverLoading.value = true;
        return;
      }

    };



    return {
      param,
      ebooks,
      pagination,
      columns,
      loading,
      data,

      getCategoryName,


      level1,



      fileList,
      coverLoading,
      imageUrl,
      handleChange,

      SERVER
    }
  }
});
</script>

