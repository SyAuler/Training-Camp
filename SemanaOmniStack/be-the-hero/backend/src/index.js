/**
 * Rota / recurso
 * Métodos HTTP:
 * GET: buscar uma informação no backend
 * POST: criar uma informação no backend
 * PUT: Alterar uma informação no backend
 * DELETE: deletar uma informação no backend
 */

 /**
  * Tipos de PArâmetros:
  * Query Params: parametros nomeados enviados na rota após "?" e geralmente
  * servem para filtros, paginação
  * Route Params: Parametros utilizados para identificar recursos (id)
  * Request Body: corpo da requisição utilizado para criar ou alterar recursos
  * 
  */

  /**
   * Banco de dados SQLite
   * Driver: select * from users
   * Query Builder: table('users).select('*).where()
   * 
   */
  
const express = require('express');
const cors = require('cors');
const routes = require('./routes'); /** O ponto é para referenciar a mesma pasta */

const app = express();

app.use(cors());
app.use(express.json());
app.use(routes);



app.listen(3333);

