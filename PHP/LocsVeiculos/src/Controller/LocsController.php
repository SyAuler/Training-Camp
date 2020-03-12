<?php
namespace App\Controller;

use App\Controller\AppController;

/**
 * Locs Controller
 *
 * @property \App\Model\Table\LocsTable $Locs
 *
 * @method \App\Model\Entity\Loc[]|\Cake\Datasource\ResultSetInterface paginate($object = null, array $settings = [])
 */
class LocsController extends AppController
{
    /**
     * Index method
     *
     * @return \Cake\Http\Response|null
     */
    public function index()
    {
        $locs = $this->paginate($this->Locs);

        $this->set(compact('locs'));
    }

    /**
     * View method
     *
     * @param string|null $id Loc id.
     * @return \Cake\Http\Response|null
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function view($id = null)
    {
        $loc = $this->Locs->get($id, [
            'contain' => ['Pagamentos', 'Clientes', 'Funcionarios', 'Inventarios']
        ]);

        $this->set('loc', $loc);
    }

    /**
     * Add method
     *
     * @return \Cake\Http\Response|null Redirects on successful add, renders view otherwise.
     */
    public function add()
    {
        $loc = $this->Locs->newEntity();
        if ($this->request->is('post')) {
            $loc = $this->Locs->patchEntity($loc, $this->request->getData());
            if ($this->Locs->save($loc)) {
                $this->Flash->success(__('The loc has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The loc could not be saved. Please, try again.'));
        }
        $clientes = $this->Locs->Clientes->find('list', ['limit' => 200]);
        $carros = $this->Locs->Carros->find('list', ['limit' => 200]);
        $funcionarios = $this->Locs->Funcionarios->find('list', ['limit' => 200]);
        $this->set(compact('loc', 'clientes', 'carros', 'funcionarios'));
    }

    /**
     * Edit method
     *
     * @param string|null $id Loc id.
     * @return \Cake\Http\Response|null Redirects on successful edit, renders view otherwise.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function edit($id = null)
    {
        $loc = $this->Locs->get($id, [
            'contain' => []
        ]);
        if ($this->request->is(['patch', 'post', 'put'])) {
            $loc = $this->Locs->patchEntity($loc, $this->request->getData());
            if ($this->Locs->save($loc)) {
                $this->Flash->success(__('The loc has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The loc could not be saved. Please, try again.'));
        }
        $this->set(compact('loc'));
    }

    /**
     * Delete method
     *
     * @param string|null $id Loc id.
     * @return \Cake\Http\Response|null Redirects to index.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function delete($id = null)
    {
        $this->request->allowMethod(['post', 'delete']);
        $loc = $this->Locs->get($id);
        if ($this->Locs->delete($loc)) {
            $this->Flash->success(__('The loc has been deleted.'));
        } else {
            $this->Flash->error(__('The loc could not be deleted. Please, try again.'));
        }

        return $this->redirect(['action' => 'index']);
    }
}
