<?php
namespace App\Controller;

use App\Controller\AppController;

/**
 * Carros Controller
 *
 * @property \App\Model\Table\CarrosTable $Carros
 *
 * @method \App\Model\Entity\Carro[]|\Cake\Datasource\ResultSetInterface paginate($object = null, array $settings = [])
 */
class CarrosController extends AppController
{
    /**
     * Index method
     *
     * @return \Cake\Http\Response|null
     */
    public function index()
    {
        $carros = $this->paginate($this->Carros);

        $this->set(compact('carros'));
    }

    /**
     * View method
     *
     * @param string|null $id Carro id.
     * @return \Cake\Http\Response|null
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function view($id = null)
    {
        $carro = $this->Carros->get($id, [
            'contain' => ['Modelos', 'Inventarios']
        ]);

        $this->set('carro', $carro);
    }

    /**
     * Add method
     *
     * @return \Cake\Http\Response|null Redirects on successful add, renders view otherwise.
     */
    public function add()
    {
        $carro = $this->Carros->newEntity();
        if ($this->request->is('post')) {
            $carro = $this->Carros->patchEntity($carro, $this->request->getData());
            if ($this->Carros->save($carro)) {
                $this->Flash->success(__('The carro has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The carro could not be saved. Please, try again.'));
        }
        $modelos = $this->Carros->Modelos->find('list', ['limit' => 200]);
        $this->set(compact('carro', 'modelos'));
    }

    /**
     * Edit method
     *
     * @param string|null $id Carro id.
     * @return \Cake\Http\Response|null Redirects on successful edit, renders view otherwise.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function edit($id = null)
    {
        $carro = $this->Carros->get($id, [
            'contain' => []
        ]);
        if ($this->request->is(['patch', 'post', 'put'])) {
            $carro = $this->Carros->patchEntity($carro, $this->request->getData());
            if ($this->Carros->save($carro)) {
                $this->Flash->success(__('The carro has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The carro could not be saved. Please, try again.'));
        }
        $this->set(compact('carro'));
    }

    /**
     * Delete method
     *
     * @param string|null $id Carro id.
     * @return \Cake\Http\Response|null Redirects to index.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function delete($id = null)
    {
        $this->request->allowMethod(['post', 'delete']);
        $carro = $this->Carros->get($id);
        if ($this->Carros->delete($carro)) {
            $this->Flash->success(__('The carro has been deleted.'));
        } else {
            $this->Flash->error(__('The carro could not be deleted. Please, try again.'));
        }

        return $this->redirect(['action' => 'index']);
    }
}
