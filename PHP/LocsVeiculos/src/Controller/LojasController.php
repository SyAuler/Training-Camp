<?php
namespace App\Controller;

use App\Controller\AppController;

/**
 * Lojas Controller
 *
 * @property \App\Model\Table\LojasTable $Lojas
 *
 * @method \App\Model\Entity\Loja[]|\Cake\Datasource\ResultSetInterface paginate($object = null, array $settings = [])
 */
class LojasController extends AppController
{
    /**
     * Index method
     *
     * @return \Cake\Http\Response|null
     */
    public function index()
    {
        $this->paginate = [
            'contain' => ['Enderecos']
        ];
        $lojas = $this->paginate($this->Lojas);

        $this->set(compact('lojas'));
    }

    /**
     * View method
     *
     * @param string|null $id Loja id.
     * @return \Cake\Http\Response|null
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function view($id = null)
    {
        $loja = $this->Lojas->get($id, [
            'contain' => ['Enderecos', 'Funcionarios', 'Inventarios']
        ]);

        $this->set('loja', $loja);
    }

    /**
     * Add method
     *
     * @return \Cake\Http\Response|null Redirects on successful add, renders view otherwise.
     */
    public function add()
    {
        $loja = $this->Lojas->newEntity();
        if ($this->request->is('post')) {
            $loja = $this->Lojas->patchEntity($loja, $this->request->getData());
            if ($this->Lojas->save($loja)) {
                $this->Flash->success(__('The loja has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The loja could not be saved. Please, try again.'));
        }
        $enderecos = $this->Lojas->Enderecos->find('list', ['limit' => 200]);
        $this->set(compact('loja', 'enderecos'));
    }

    /**
     * Edit method
     *
     * @param string|null $id Loja id.
     * @return \Cake\Http\Response|null Redirects on successful edit, renders view otherwise.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function edit($id = null)
    {
        $loja = $this->Lojas->get($id, [
            'contain' => []
        ]);
        if ($this->request->is(['patch', 'post', 'put'])) {
            $loja = $this->Lojas->patchEntity($loja, $this->request->getData());
            if ($this->Lojas->save($loja)) {
                $this->Flash->success(__('The loja has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The loja could not be saved. Please, try again.'));
        }
        $enderecos = $this->Lojas->Enderecos->find('list', ['limit' => 200]);
        $this->set(compact('loja', 'enderecos'));
    }

    /**
     * Delete method
     *
     * @param string|null $id Loja id.
     * @return \Cake\Http\Response|null Redirects to index.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function delete($id = null)
    {
        $this->request->allowMethod(['post', 'delete']);
        $loja = $this->Lojas->get($id);
        if ($this->Lojas->delete($loja)) {
            $this->Flash->success(__('The loja has been deleted.'));
        } else {
            $this->Flash->error(__('The loja could not be deleted. Please, try again.'));
        }

        return $this->redirect(['action' => 'index']);
    }
}
