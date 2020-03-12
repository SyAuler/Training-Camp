<?php
namespace App\Controller;

use App\Controller\AppController;

/**
 * Rules Controller
 *
 * @property \App\Model\Table\RulesTable $Rules
 *
 * @method \App\Model\Entity\Rule[]|\Cake\Datasource\ResultSetInterface paginate($object = null, array $settings = [])
 */
class RulesController extends AppController
{
    /**
     * Index method
     *
     * @return \Cake\Http\Response|null
     */
    public function index()
    {
        $rules = $this->paginate($this->Rules);

        $this->set(compact('rules'));
    }

    /**
     * View method
     *
     * @param string|null $id Rule id.
     * @return \Cake\Http\Response|null
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function view($id = null)
    {
        $rule = $this->Rules->get($id, [
            'contain' => ['Users']
        ]);

        $this->set('rule', $rule);
    }

    /**
     * Add method
     *
     * @return \Cake\Http\Response|null Redirects on successful add, renders view otherwise.
     */
    public function add()
    {
        $rule = $this->Rules->newEntity();
        if ($this->request->is('post')) {
            $rule = $this->Rules->patchEntity($rule, $this->request->getData());
            if ($this->Rules->save($rule)) {
                $this->Flash->success(__('The rule has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The rule could not be saved. Please, try again.'));
        }
        $users = $this->Rules->Users->find('list', ['limit' => 200]);
        $this->set(compact('rule', 'users'));
    }

    /**
     * Edit method
     *
     * @param string|null $id Rule id.
     * @return \Cake\Http\Response|null Redirects on successful edit, renders view otherwise.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function edit($id = null)
    {
        $rule = $this->Rules->get($id, [
            'contain' => []
        ]);
        if ($this->request->is(['patch', 'post', 'put'])) {
            $rule = $this->Rules->patchEntity($rule, $this->request->getData());
            if ($this->Rules->save($rule)) {
                $this->Flash->success(__('The rule has been saved.'));

                return $this->redirect(['action' => 'index']);
            }
            $this->Flash->error(__('The rule could not be saved. Please, try again.'));
        }
        $this->set(compact('rule'));
    }

    /**
     * Delete method
     *
     * @param string|null $id Rule id.
     * @return \Cake\Http\Response|null Redirects to index.
     * @throws \Cake\Datasource\Exception\RecordNotFoundException When record not found.
     */
    public function delete($id = null)
    {
        $this->request->allowMethod(['post', 'delete']);
        $rule = $this->Rules->get($id);
        if ($this->Rules->delete($rule)) {
            $this->Flash->success(__('The rule has been deleted.'));
        } else {
            $this->Flash->error(__('The rule could not be deleted. Please, try again.'));
        }

        return $this->redirect(['action' => 'index']);
    }
}
