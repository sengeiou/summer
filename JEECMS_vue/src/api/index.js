const modulesFiles = require.context('./apis', true, /\.js$/)
const modules = modulesFiles.keys().reduce((modules, key) => {
  const value = modulesFiles(key)
  modules = Object.assign(modules, value.default)
  return modules
}, {})

export default modules
