module.exports = {
  root: true,
  env: {
    node: true
  },
  'extends': [
    'plugin:vue/vue3-essential',
    'eslint:recommended',
    '@vue/typescript/recommended'
  ],
  parserOptions: {
    ecmaVersion: 2020
  },
  rules: {
    'no-console': process.env.NODE_ENV === 'production' ? 'warn' : 'off',
    'no-debugger': process.env.NODE_ENV === 'production' ? 'warn' : 'off',
    'vue/no-unused-components':'off',
    '@typescript-eslint/no-explicit-any':'off',
    'vue/multi-word-component-names':'off',
    'vue/no-unused-vars':'off',
    '@typescript-eslint/no-unused-vars':'off',
    ' vue/no-parsing-error':'off',
    '@typescript-eslint/no-explicity-any':0,
    'ue/no-unused-vars':0,
  }
}
