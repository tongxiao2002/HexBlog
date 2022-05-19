<template>
    <div id="sideNav" class="sidenav">
      <div id="introduction" class="intro">
        <img src="../../../static/images/wallhaven-3kp6yv.png" align="center">
        <h1 align="center">{{ author }}</h1>     <!-- Author Name -->
        <p align="center">{{ introduction }}</p>    <!-- Author's introduction -->
        <i class="fa fa-github"></i>
        <i class="fa fa-qq"></i>
        <!-- links with icon -->
      </div>
    </div>
</template>

<script>
// import { getRequest } from '../utils/api'

export default {
    data() {
      return {
        author: "TownShaw",                           // TODO: become a variable
        introduction: "Undergraduate in USTC"         // TODO: become a variable
      }
    },
    methods: {

    },
    beforeMount() {

    }
}
</script>

<style>
  .sidenav {
    position: fixed;  /* fixed position, stay in place */
    height: 100%;
    width: 300px;
    overflow: hidden;
    background-color: rgba(0, 0, 0, 0.75);
    opacity: 0.7;
    /* background-image: "../../static/images/logo.png"; */
  }
  .intro {
    width: 98%;
    text-align: center;
    top: 50%;
    left: 50%;
    position: absolute;
    transform: translate(-50%, -50%);
    margin: 40px auto 0;
  }
  .sidenav img {
    width: 70%;
    height: auto;
    overflow: hidden;
    border-radius: 70%;
  }
  .sidenav a {
    color: azure;
  }

@import '/home/xt/Develop/bootstrap-5.1.3-dist/css/bootstrap.min.css';
</style>
