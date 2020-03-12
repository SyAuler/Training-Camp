<?php
namespace App\Controller;

use App\Controller\AppController;

/**
 * Inventarios Controller
 *
 * @property \App\Model\Table\InventariosTable $Inventarios
 *
 * @method \App\Model\Entity\Inventario[]|\Cake\Datasource\ResultSetInterface paginate($object = null, array $settings = [])
 */
class InventariosController extends AppController
{
    /**
     * Index method
     *
     * @return \Cake\Http\Response|null
     */
    public function index()
    {
        $this->paginate = [
            'contain' => ['Carros']
        ];
        $inventarios = $this->paginate($this->Inventarios);

        $this->set(compact('inventarios'));
    }

    /**
     * View method
     *
     * @param string|null $id Inventario id.
     * @return \Cake\Http\Response|null
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function view($id = null)
    {
        $inventario = $this->Inventarios->get($id, [
            'contain' => ['Carros', 'Lojas', 'Locs']
        ]);

        $this->set('inventario', $inventario);
    }

    /**
     * Add method
     *
     * @return \Cake\Http\Response|null Redirects on successful add, renders view otherwise.
     */
    public function add()
    {
        $inventario = $this->Inventarios->newEntity();
        if ($this->request->is('post')) {
            $inventario = $this->Inventarios->patchEntity($inventario, $this->request->getData());
            if ($this->Inventarios->save($inventario)) {
                $this->Flash->success(__('The inventario has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The inventario could not be saved. Please, try again.'));
        }
        $carros = $this->Inventarios->Carros->find('list', ['limit' => 200]);
        $lojas = $this->Inventarios->Lojas->find('list', ['limit' => 200]);
        $this->set(compact('inventario', 'carros', 'lojas'));
    }

    /**
     * Edit method
     *
     * @param string|null $id Inventario id.
     * @return \Cake\Http\Response|null Redirects on successful edit, renders view otherwise.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function edit($id = null)
    {
        $inventario = $this->Inventarios->get($id, [
            'contain' => []
        ]);
        if ($this->request->is(['patch', 'post', 'put'])) {
            $inventario = $this->Inventarios->patchEntity($inventario, $this->request->getData());
            if ($this->Inventarios->save($inventario)) {
                $this->Flash->success(__('The inventario has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The inventario could not be saved. Please, try again.'));
        }
        $carros = $this->Inventarios->Carros->find('list', ['limit' => 200]);
        $this->set(compact('inventario', 'carros'));
    }

    /**
     * Delete method
     *
     * @param string|null $id Inventario id.
     * @return \Cake\Http\Response|null Redirects to index.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function delete($id = null)
    {
        $this->request->allowMethod(['post', 'delete']);
        $inventario = $this->Inventarios->get($id);
        if ($this->Inventarios->delete($inventario)) {
            $this->Flash->success(__('The inventario has been deleted.'));
        } else {
            $this->Flash->error(__('The inventario could not be deleted. Please, try again.'));
        }

        return $this->redirect(['action' => 'index']);
    }
}
