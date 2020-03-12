<?php
namespace App\Test\TestCase\Model\Table;

use App\Model\Table\ModelosTable;
use Cake\ORM\TableRegistry;
use Cake\TestSuite\TestCase;

/**
 * App\Model\Table\ModelosTable Test Case
 */
class ModelosTableTest extends TestCase
{
    /**
     * Test subject
     *
     * @var \App\Model\Table\ModelosTable
     */
    public $Modelos;

    /**
     * Fixtures
     *
     * @var array
     */
    public $fixtures = [
        'app.Modelos',
        'app.Carros'
    ];

    /**
     * setUp method
     *
     * @return void
     */
    public function setUp()
    {
        parent::setUp();
        $config = TableRegistry::getTableLocator()->exists('Modelos') ? [] : ['className' => ModelosTable::class];
        $this->Modelos = TableRegistry::getTableLocator()->get('Modelos', $config);
    }

    /**
     * tearDown method
     *
     * @return void
     */
    public function tearDown()
    {
        unset($this->Modelos);

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
