<template>
  <a-layout>

    <a-layout-sider width="200" style="background: #fff">
      <a-menu

          mode="inline"
          :style="{ height: '100%', borderRight: 0 }"
      >
        <a-sub-menu key="sub1">
          <template #title>
              <span><laptop-outlined />subnav 1111</span>
          </template>
          <a-menu-item key="1">option1</a-menu-item>
          <a-menu-item key="2">option2</a-menu-item>
          <a-menu-item key="3">option3</a-menu-item>
          <a-menu-item key="4">option4</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub2">
          <template #title>
              <span><laptop-outlined />subnav 222</span>
          </template>
          <a-menu-item key="5">option5</a-menu-item>
          <a-menu-item key="6">option6</a-menu-item>
          <a-menu-item key="7">option7</a-menu-item>
          <a-menu-item key="8">option8</a-menu-item>
        </a-sub-menu>
        <a-sub-menu key="sub3">
          <template #title>
              <span><notification-outlined />subnav 3</span>
          </template>
          <a-menu-item key="9">option9</a-menu-item>
          <a-menu-item key="10">option10</a-menu-item>
          <a-menu-item key="11">option11</a-menu-item>
          <a-menu-item key="12">option12</a-menu-item>
        </a-sub-menu>
      </a-menu>

    </a-layout-sider>
    <a-layout-content
        :style="{ background: '#fff', padding: '24px', margin: 0, minHeight: '280px' }"
    >
      <a-list item-layout="vertical" size="large" :grid="{ gutter: 20, column: 3 }" :data-source="ebooks">
      <template #renderItem="{ item }">
        <a-list-item key="item.infName">
          <template #actions>
          <span v-for="{ type, text } in actions" :key="type">
            <component :is="type" style="margin-right: 8px" />
            {{ text }}
          </span>
          </template>

          <a-list-item-meta :description="item.description">
            <template #title>
              <a :href="item.href">{{ item.infName }}</a>
            </template>
            <template #avatar><a-avatar :src="item.cover" /></template>
          </a-list-item-meta>

        </a-list-item>
      </template>
    </a-list>
    </a-layout-content>
  </a-layout>
</template>

<script lang="ts">
import {defineComponent, onMounted, ref, reactive, toRef} from 'vue';

import axios from "axios";





// for (let i = 0; i < 23; i++) {
//   listData.push({
//     href: 'https://www.antdv.com/',
//     title: `ant design vue part ${i}`,
//     avatar: 'https://joeschmoe.io/api/v1/random',
//     description:
//         'Ant Design, a design language for background applications, is refined by Ant UED Team.',
//     content:
//         'We supply a series of design principles, practical patterns and high quality design resources (Sketch and Axure), to help people create their product prototypes beautifully and efficiently.',
//   });
// }




export default defineComponent({
  name: 'HomeView',
  setup() {

    //ref 订阅响应式数据  需要import 导入进来
    const ebooks = ref();
    const ebooksd = reactive({books:[]});
    const value = ref<string>('');

    //onMounted  生命周期函数，相当于初始化方法
    onMounted(() =>{
      axios.get("/test/infList",{
        params:{
          page:1,
          size:10
        }
          }).then((response) =>{
        //response 里面有一个 data 需要把data拿出来。
        const data = response.data;
        //ref定义的数据需要 .value方法获取数据。
        ebooks.value = data.content.list;
        ebooksd.books = data.content;

      })
    })
    //     const pagination = {
    //       pageSize: 5,
    //     };
    //     const actions: any = [
    //       { type: 'StarOutlined', text: '156' },
    //       { type: 'LikeOutlined', text: '156' },
    //       { type: 'MessageOutlined', text: '2' },
    //     ];
    //      const onSearch = (searchValue: string) => {
    //    console.log('use value', searchValue);
    // //   // console.log('or use this.value', value.value);
    //  };

    return {
            ebooks,
            // ebooks2:toRef(ebooksd,"books"),
            // listData,
            pagination:{
              onChange:(page:any) =>{
                console.log(page);
              },
              pageSize: 3,
            },
            actions:[
              { type: 'StarOutlined', text: '156' },
              { type: 'LikeOutlined', text: '156' },
              { type: 'MessageOutlined', text: '2' },
            ],
            value,
            // onSearch,
    }
  },

});
</script>
<style scoped>
.ant-avatar {
  width: 50px;
  height: 50px;
  line-height: 50px;
  border-radius: 8%;
  margin: 5px 0;
}
</style>
