<template>
  <!-- Search -->
  <div>
    <b-form-select v-model="selected" class="thumbnail_select" :options="options">
    </b-form-select>
    <div class="galleryContainer">
      <div class="gallery" v-for="item in demo.items">
        <img v-bind:class="[selected]" :src="require(`${item.thumbnails}`)" />
        <div class="thumbnailName">{{ item.name }}</div>
      </div>
    </div>
  </div>
</template>

<script>
import axios from "axios";

export default {
  name: "Gallery",
  components: {},
  data() {
    var demo = {
      location: "testLocation",
      items: [
        {
          id: 1,
          name: "sample1.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample1.jpg",
        },
        {
          id: 2,
          name: "sample2.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample2.jpg",
        },
        {
          id: 3,
          name: "sample3.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample3.jpg",
        },
        {
          id: 4,
          name: "sample4.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample7.jpg",
        },
        {
          id: 5,
          name: "sample5.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample5.jpg",
        },
        {
          id: 6,
          name: "sample6.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample6.jpg",
        },
        {
          id: 7,
          name: "sample7.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample7.jpg",
        },
        {
          id: 8,
          name: "sample8.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample8.jpg",
        },
        {
          id: 7,
          name: "sample9.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample9.jpg",
        },
        {
          id: 8,
          name: "sample10.png",
          lastModified: "2020-12-14",
          thumbnails: "./img/sample10.jpg",
        },
      ],
    };
    return {
      demo,
      selected: "medium",
      options: ["small", "medium", "large"]
    };
  },
};
</script> 
<style>
</style>
