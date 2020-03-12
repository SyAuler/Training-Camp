<?php
namespace App\Test\TestCase\Model\Table;

use App\Model\Table\LojasTable;
use Cake\ORM\TableRegistry;
use Cake\TestSuite\TestCase;

/**
 * App\Model\Table\LojasTable Test Case
 */
class LojasTableTest extends TestCase
{
    /**
     * Test subject
     *
     * @var \App\Model\Table\LojasTable
     */
    public $Lojas;

    /**
     * Fixtures
     *
     * @var array
     */
    public $fixtures = [
        'app.Lojas',
        'app.Funcionarios',
        'app.Inventarios',
        'app.Enderecos'
    ];

    /**
     * setUp method
     *
     * @return void
     */
    public function setUp()
    {
        parent::setUp();
        $config = TableRegistry::getTableLocator()->exists('Lojas') ? [] : ['className' => LojasTable::class];
        $this->Lojas = TableRegistry::getTableLocator()->get('Lojas', $config);
    }

    /**
     * tearDown method
     *
     * @return void
     */
    public function tearDown()
    {
        unset($this->Lojas);

        parent::tearDown();
    }

    /**
     * Test initialize method
     *
     * @return void
     */
    public function testInitialize()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }

    /**
     * Test validationDefault method
     *
     * @return void
     */
    public function testValidationDefault()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }

    /**
     * Test buildRules method
     *
     * @return void
     */
    public function testBuildRules()
    {
        $this->markTestIncomplete('Not implemented yet.');
    }
}
