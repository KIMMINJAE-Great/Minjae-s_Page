const { defineConfig } = require('@vue/cli-service')
module.exports = defineConfig({
  transpileDependencies: true
})

const target = 'http://localhost:8080/apiserverex'
module.exports = {
  devServer: {
    port: 3000,
    proxy : {
      "/api": {target, changeOrigin: true}
    }
  },
  outputDir: '../backend/public',
}
// module.exports = {
//   devServer: {
//       proxy: {
//           '/': {
//               target: 'http://localhost:8080',
//               changeOrigin: true,
//               pathRewrite: {
//                   '^/': ''
//               }
//           }
//       }
//   }
// }