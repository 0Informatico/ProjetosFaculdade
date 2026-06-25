import { useState } from 'react'
import { BrowserRouter as Router, Routes, Route, Link } from 'react-router-dom'
import { Search, Users, MapPin, FileText, Menu, X } from 'lucide-react'
import { Button } from '@/components/ui/button.jsx'
import { Card, CardContent, CardDescription, CardHeader, CardTitle } from '@/components/ui/card.jsx'
import { Input } from '@/components/ui/input.jsx'
import { Badge } from '@/components/ui/badge.jsx'
import './App.css'

// Componente de Header
function Header() {
  const [isMenuOpen, setIsMenuOpen] = useState(false)

  return (
    <header className="bg-blue-600 text-white shadow-lg">
      <div className="container mx-auto px-4 py-4">
        <div className="flex items-center justify-between">
          <Link to="/" className="text-2xl font-bold">
            Projeto Inclusive
          </Link>
          
          {/* Menu Desktop */}
          <nav className="hidden md:flex space-x-6">
            <Link to="/" className="hover:text-blue-200 transition-colors">Início</Link>
            <Link to="/buscar" className="hover:text-blue-200 transition-colors">Buscar Profissionais</Link>
            <Link to="/escolas" className="hover:text-blue-200 transition-colors">Escolas</Link>
            <Link to="/recursos" className="hover:text-blue-200 transition-colors">Recursos</Link>
            <Link to="/admin" className="hover:text-blue-200 transition-colors">Administração</Link>
          </nav>

          {/* Menu Mobile */}
          <button 
            className="md:hidden"
            onClick={() => setIsMenuOpen(!isMenuOpen)}
          >
            {isMenuOpen ? <X size={24} /> : <Menu size={24} />}
          </button>
        </div>

        {/* Menu Mobile Expandido */}
        {isMenuOpen && (
          <nav className="md:hidden mt-4 space-y-2">
            <Link to="/" className="block py-2 hover:text-blue-200 transition-colors">Início</Link>
            <Link to="/buscar" className="block py-2 hover:text-blue-200 transition-colors">Buscar Profissionais</Link>
            <Link to="/escolas" className="block py-2 hover:text-blue-200 transition-colors">Escolas</Link>
            <Link to="/recursos" className="block py-2 hover:text-blue-200 transition-colors">Recursos</Link>
            <Link to="/admin" className="block py-2 hover:text-blue-200 transition-colors">Administração</Link>
          </nav>
        )}
      </div>
    </header>
  )
}

// Página Inicial
function HomePage() {
  return (
    <div className="space-y-8">
      {/* Hero Section */}
      <section className="bg-gradient-to-r from-blue-500 to-green-500 text-white py-16">
        <div className="container mx-auto px-4 text-center">
          <h1 className="text-4xl md:text-6xl font-bold mb-4">
            Conectando Cuidado e Educação
          </h1>
          <p className="text-xl md:text-2xl mb-8 max-w-3xl mx-auto">
            Uma plataforma inovadora para facilitar o acesso a informações sobre professores especializados no cuidado de crianças com deficiência
          </p>
          <div className="space-x-4">
            <Button asChild size="lg" variant="outline" className="border-white bg-white text-blue-600 hover:bg-blue-600 hover:text-gray-100">
              <Link to="/buscar">Buscar Profissionais</Link>
            </Button>
            <Button asChild size="lg" variant="outline" className="border-white text-blue-600 hover:bg-blue-600 hover:text-gray-100">
              <Link to="/recursos">Saiba Mais</Link>
            </Button>
          </div>
        </div>
      </section>

      {/* Funcionalidades Principais */}
      <section className="container mx-auto px-4">
        <h2 className="text-3xl font-bold text-center mb-12">Principais Funcionalidades</h2>
        <div className="grid md:grid-cols-2 lg:grid-cols-4 gap-6">
          <Card className="text-center">
            <CardHeader>
              <Search className="w-12 h-12 mx-auto text-blue-600 mb-4" />
              <CardTitle>Busca Inteligente</CardTitle>
            </CardHeader>
            <CardContent>
              <CardDescription>
                Encontre profissionais por nome, especialização, escola ou tipo de deficiência atendida
              </CardDescription>
            </CardContent>
          </Card>

          <Card className="text-center">
            <CardHeader>
              <Users className="w-12 h-12 mx-auto text-green-600 mb-4" />
              <CardTitle>Perfis Detalhados</CardTitle>
            </CardHeader>
            <CardContent>
              <CardDescription>
                Visualize informações completas sobre formação, especialização e área de atuação
              </CardDescription>
            </CardContent>
          </Card>

          <Card className="text-center">
            <CardHeader>
              <MapPin className="w-12 h-12 mx-auto text-purple-600 mb-4" />
              <CardTitle>Mapa de Escolas</CardTitle>
            </CardHeader>
            <CardContent>
              <CardDescription>
                Localize escolas com profissionais especializados em sua região
              </CardDescription>
            </CardContent>
          </Card>

          <Card className="text-center">
            <CardHeader>
              <FileText className="w-12 h-12 mx-auto text-orange-600 mb-4" />
              <CardTitle>Recursos Informativos</CardTitle>
            </CardHeader>
            <CardContent>
              <CardDescription>
                Acesse conteúdos sobre leis, direitos e serviços disponíveis
              </CardDescription>
            </CardContent>
          </Card>
        </div>
      </section>

      {/* Personas Atendidas */}
      <section className="bg-gray-50 py-16">
        <div className="container mx-auto px-4">
          <h2 className="text-3xl font-bold text-center mb-12">Quem Utilizará o Sistema</h2>
          <div className="grid md:grid-cols-2 lg:grid-cols-4 gap-6">
            <Card>
              <CardHeader>
                <CardTitle className="text-blue-600">Professores</CardTitle>
              </CardHeader>
              <CardContent>
                <CardDescription>
                  Professores da sala comum que buscam apoio e informações sobre profissionais especializados
                </CardDescription>
              </CardContent>
            </Card>

            <Card>
              <CardHeader>
                <CardTitle className="text-green-600">Gestores Escolares</CardTitle>
              </CardHeader>
              <CardContent>
                <CardDescription>
                  Diretores e coordenadores que precisam de uma visão geral dos profissionais da rede
                </CardDescription>
              </CardContent>
            </Card>

            <Card>
              <CardHeader>
                <CardTitle className="text-purple-600">Familiares</CardTitle>
              </CardHeader>
              <CardContent>
                <CardDescription>
                  Pais e responsáveis que desejam transparência sobre o atendimento de seus filhos
                </CardDescription>
              </CardContent>
            </Card>

            <Card>
              <CardHeader>
                <CardTitle className="text-orange-600">Administradores</CardTitle>
              </CardHeader>
              <CardContent>
                <CardDescription>
                  Profissionais da Secretaria de Educação responsáveis pela gestão do sistema
                </CardDescription>
              </CardContent>
            </Card>
          </div>
        </div>
      </section>
    </div>
  )
}

// Página de Busca de Profissionais
function BuscarProfissionais() {
  const [searchTerm, setSearchTerm] = useState('')
  const [selectedFilter, setSelectedFilter] = useState('todos')

  // Dados simulados de profissionais
  const profissionais = [
    {
      id: 1,
      nome: "Maria Silva",
      formacao: "Pedagogia com especialização em Educação Especial",
      escola: "EMEF João Carlos",
      especializacoes: ["TEA", "TDAH"],
      regiao: "Centro"
    },
    {
      id: 2,
      nome: "João Santos",
      formacao: "Psicopedagogia",
      escola: "EMEF Maria Antônia",
      especializacoes: ["Deficiência Visual", "Deficiência Intelectual"],
      regiao: "Norte"
    },
    {
      id: 3,
      nome: "Ana Costa",
      formacao: "Fonoaudiologia",
      escola: "EMEF Pedro Alvares",
      especializacoes: ["TEA", "Deficiência Auditiva"],
      regiao: "Sul"
    }
  ]

  const filteredProfissionais = profissionais.filter(prof => 
    prof.nome.toLowerCase().includes(searchTerm.toLowerCase()) ||
    prof.escola.toLowerCase().includes(searchTerm.toLowerCase()) ||
    prof.especializacoes.some(esp => esp.toLowerCase().includes(searchTerm.toLowerCase()))
  )

  return (
    <div className="container mx-auto px-4 py-8">
      <h1 className="text-3xl font-bold mb-8">Buscar Profissionais</h1>
      
      {/* Barra de Busca */}
      <div className="mb-8 space-y-4">
        <div className="flex gap-4">
          <Input
            placeholder="Buscar por nome, escola ou especialização..."
            value={searchTerm}
            onChange={(e) => setSearchTerm(e.target.value)}
            className="flex-1"
          />
          <Button>
            <Search className="w-4 h-4 mr-2" />
            Buscar
          </Button>
        </div>
        
        {/* Filtros */}
        <div className="flex flex-wrap gap-2">
          <Badge 
            variant={selectedFilter === 'todos' ? 'default' : 'outline'}
            className="cursor-pointer"
            onClick={() => setSelectedFilter('todos')}
          >
            Todos
          </Badge>
          <Badge 
            variant={selectedFilter === 'tea' ? 'default' : 'outline'}
            className="cursor-pointer"
            onClick={() => setSelectedFilter('tea')}
          >
            TEA
          </Badge>
          <Badge 
            variant={selectedFilter === 'tdah' ? 'default' : 'outline'}
            className="cursor-pointer"
            onClick={() => setSelectedFilter('tdah')}
          >
            TDAH
          </Badge>
          <Badge 
            variant={selectedFilter === 'visual' ? 'default' : 'outline'}
            className="cursor-pointer"
            onClick={() => setSelectedFilter('visual')}
          >
            Deficiência Visual
          </Badge>
        </div>
      </div>

      {/* Resultados */}
      <div className="grid gap-6">
        {filteredProfissionais.map(prof => (
          <Card key={prof.id} className="hover:shadow-lg transition-shadow">
            <CardHeader>
              <div className="flex justify-between items-start">
                <div>
                  <CardTitle className="text-xl">{prof.nome}</CardTitle>
                  <CardDescription className="text-lg">{prof.formacao}</CardDescription>
                </div>
                <Badge variant="outline">{prof.regiao}</Badge>
              </div>
            </CardHeader>
            <CardContent>
              <div className="space-y-2">
                <p><strong>Escola:</strong> {prof.escola}</p>
                <div className="flex flex-wrap gap-2">
                  <span className="font-medium">Especializações:</span>
                  {prof.especializacoes.map(esp => (
                    <Badge key={esp} variant="secondary">{esp}</Badge>
                  ))}
                </div>
              </div>
              <div className="mt-4">
                <Button variant="outline" size="sm">Ver Perfil Completo</Button>
              </div>
            </CardContent>
          </Card>
        ))}
      </div>

      {filteredProfissionais.length === 0 && (
        <div className="text-center py-12">
          <p className="text-gray-500 text-lg">Nenhum profissional encontrado com os critérios de busca.</p>
        </div>
      )}
    </div>
  )
}

// Página de Escolas
function EscolasPage() {
  const escolas = [
    {
      id: 1,
      nome: "EMEF João Carlos",
      endereco: "Rua das Flores, 123 - Centro",
      profissionais: 3,
      especializacoes: ["TEA", "TDAH", "Deficiência Visual"]
    },
    {
      id: 2,
      nome: "EMEF Maria Antônia",
      endereco: "Av. Principal, 456 - Norte",
      profissionais: 2,
      especializacoes: ["Deficiência Visual", "Deficiência Intelectual"]
    },
    {
      id: 3,
      nome: "EMEF Pedro Alvares",
      endereco: "Rua do Sul, 789 - Sul",
      profissionais: 4,
      especializacoes: ["TEA", "Deficiência Auditiva", "TDAH"]
    }
  ]

  return (
    <div className="container mx-auto px-4 py-8">
      <h1 className="text-3xl font-bold mb-8">Escolas da Rede</h1>
      
      <div className="grid gap-6">
        {escolas.map(escola => (
          <Card key={escola.id} className="hover:shadow-lg transition-shadow">
            <CardHeader>
              <CardTitle className="text-xl">{escola.nome}</CardTitle>
              <CardDescription>{escola.endereco}</CardDescription>
            </CardHeader>
            <CardContent>
              <div className="space-y-4">
                <div className="flex items-center gap-4">
                  <Badge variant="outline">
                    {escola.profissionais} profissionais especializados
                  </Badge>
                </div>
                
                <div>
                  <span className="font-medium">Especializações disponíveis:</span>
                  <div className="flex flex-wrap gap-2 mt-2">
                    {escola.especializacoes.map(esp => (
                      <Badge key={esp} variant="secondary">{esp}</Badge>
                    ))}
                  </div>
                </div>
                
                <div className="flex gap-2">
                  <Button variant="outline" size="sm">Ver Profissionais</Button>
                  <Button variant="outline" size="sm">
                    <MapPin className="w-4 h-4 mr-2" />
                    Localização
                  </Button>
                </div>
              </div>
            </CardContent>
          </Card>
        ))}
      </div>
    </div>
  )
}

// Página de Recursos
function RecursosPage() {
  return (
    <div className="container mx-auto px-4 py-8">
      <h1 className="text-3xl font-bold mb-8">Recursos e Informações</h1>
      
      <div className="grid md:grid-cols-2 gap-8">
        <Card>
          <CardHeader>
            <CardTitle>Legislação e Direitos</CardTitle>
          </CardHeader>
          <CardContent className="space-y-4">
            <div>
              <h4 className="font-medium">Lei Brasileira de Inclusão (LBI)</h4>
              <p className="text-sm text-gray-600">Lei nº 13.146/2015 - Estatuto da Pessoa com Deficiência</p>
            </div>
            <div>
              <h4 className="font-medium">Política Nacional de Educação Especial</h4>
              <p className="text-sm text-gray-600">Diretrizes para educação inclusiva no Brasil</p>
            </div>
            <div>
              <h4 className="font-medium">Decreto nº 7.611/2011</h4>
              <p className="text-sm text-gray-600">Dispõe sobre a educação especial e o atendimento educacional especializado</p>
            </div>
            <Button variant="outline" size="sm">Ver Todos os Documentos</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Tipos de Deficiência</CardTitle>
          </CardHeader>
          <CardContent className="space-y-4">
            <div>
              <h4 className="font-medium">TEA - Transtorno do Espectro Autista</h4>
              <p className="text-sm text-gray-600">Informações sobre características e estratégias pedagógicas</p>
            </div>
            <div>
              <h4 className="font-medium">TDAH - Transtorno do Déficit de Atenção</h4>
              <p className="text-sm text-gray-600">Orientações para o ambiente escolar</p>
            </div>
            <div>
              <h4 className="font-medium">Deficiências Sensoriais</h4>
              <p className="text-sm text-gray-600">Visual, auditiva e surdocegueira</p>
            </div>
            <Button variant="outline" size="sm">Saiba Mais</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Serviços Disponíveis</CardTitle>
          </CardHeader>
          <CardContent className="space-y-4">
            <div>
              <h4 className="font-medium">Atendimento Educacional Especializado (AEE)</h4>
              <p className="text-sm text-gray-600">Salas de recursos multifuncionais</p>
            </div>
            <div>
              <h4 className="font-medium">Profissionais de Apoio</h4>
              <p className="text-sm text-gray-600">Cuidadores e mediadores escolares</p>
            </div>
            <div>
              <h4 className="font-medium">Tecnologia Assistiva</h4>
              <p className="text-sm text-gray-600">Recursos e equipamentos adaptados</p>
            </div>
            <Button variant="outline" size="sm">Contatos Úteis</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Orientações para Famílias</CardTitle>
          </CardHeader>
          <CardContent className="space-y-4">
            <div>
              <h4 className="font-medium">Como Solicitar Avaliação</h4>
              <p className="text-sm text-gray-600">Passos para encaminhamento especializado</p>
            </div>
            <div>
              <h4 className="font-medium">Direitos dos Estudantes</h4>
              <p className="text-sm text-gray-600">O que a escola deve garantir</p>
            </div>
            <div>
              <h4 className="font-medium">Participação da Família</h4>
              <p className="text-sm text-gray-600">Como colaborar com a escola</p>
            </div>
            <Button variant="outline" size="sm">Guia Completo</Button>
          </CardContent>
        </Card>
      </div>
    </div>
  )
}

// Página de Administração
function AdminPage() {
  return (
    <div className="container mx-auto px-4 py-8">
      <h1 className="text-3xl font-bold mb-8">Área Administrativa</h1>
      
      <div className="grid md:grid-cols-2 lg:grid-cols-3 gap-6">
        <Card>
          <CardHeader>
            <CardTitle>Gerenciar Profissionais</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600 mb-4">
              Cadastrar, editar e remover profissionais do sistema
            </p>
            <Button className="w-full">Acessar</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Relatórios</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600 mb-4">
              Gerar relatórios por escola, região ou especialização
            </p>
            <Button className="w-full">Gerar Relatórios</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Configurações</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600 mb-4">
              Configurar permissões e parâmetros do sistema
            </p>
            <Button className="w-full">Configurar</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Backup de Dados</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600 mb-4">
              Realizar backup e restauração dos dados
            </p>
            <Button className="w-full">Backup</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Usuários</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600 mb-4">
              Gerenciar usuários e níveis de acesso
            </p>
            <Button className="w-full">Gerenciar</Button>
          </CardContent>
        </Card>

        <Card>
          <CardHeader>
            <CardTitle>Estatísticas</CardTitle>
          </CardHeader>
          <CardContent>
            <p className="text-sm text-gray-600 mb-4">
              Visualizar estatísticas de uso do sistema
            </p>
            <Button className="w-full">Ver Estatísticas</Button>
          </CardContent>
        </Card>
      </div>
    </div>
  )
}

// Footer
function Footer() {
  return (
    <footer className="bg-gray-800 text-white py-8 mt-16">
      <div className="container mx-auto px-4">
        <div className="grid md:grid-cols-3 gap-8">
          <div>
            <h3 className="text-lg font-bold mb-4">Projeto Inclusive</h3>
            <p className="text-gray-300">
              Conectando cuidado e educação para uma sociedade mais inclusiva.
            </p>
          </div>
          <div>
            <h3 className="text-lg font-bold mb-4">Links Úteis</h3>
            <ul className="space-y-2 text-gray-300">
              <li><Link to="/recursos" className="hover:text-white">Recursos</Link></li>
              <li><Link to="/escolas" className="hover:text-white">Escolas</Link></li>
              <li><a href="#" className="hover:text-white">Contato</a></li>
              <li><a href="#" className="hover:text-white">Suporte</a></li>
            </ul>
          </div>
          <div>
            <h3 className="text-lg font-bold mb-4">Contato</h3>
            <p className="text-gray-300">
              Secretaria Municipal de Educação<br />
              Telefone: (47) 3635-1014
            </p>
          </div>
        </div>
        <div className="border-t border-gray-700 mt-8 pt-8 text-center text-gray-300">
          <p>&copy; 2024 Projeto Inclusive. Todos os direitos reservados.</p>
        </div>
      </div>
    </footer>
  )
}

// Componente Principal da Aplicação
function App() {
  return (
    <Router>
      <div className="min-h-screen bg-white">
        <Header />
        <main>
          <Routes>
            <Route path="/" element={<HomePage />} />
            <Route path="/buscar" element={<BuscarProfissionais />} />
            <Route path="/escolas" element={<EscolasPage />} />
            <Route path="/recursos" element={<RecursosPage />} />
            <Route path="/admin" element={<AdminPage />} />
          </Routes>
        </main>
        <Footer />
      </div>
    </Router>
  )
}

export default App

