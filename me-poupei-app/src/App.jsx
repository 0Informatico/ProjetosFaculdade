import { useState } from 'react'
import { Button } from '@/components/ui/button.jsx'
import { Card, CardContent } from '@/components/ui/card.jsx'
import { 
  MessageCircle, 
  BarChart3, 
  TrendingUp, 
  Bot,
  Menu,
  X
} from 'lucide-react'
import logo from './assets/logo.png'
import VoiceChat from './components/VoiceChat'
import ExpenseTracker from './components/ExpenseTracker'
import ExpenseAnalysis from './components/ExpenseAnalysis'
import TextChat from './components/TextChat'
import './App.css'

function App() {
  const [activeTab, setActiveTab] = useState('voice-chat')
  const [sidebarOpen, setSidebarOpen] = useState(false)

  const tabs = [
    {
      id: 'voice-chat',
      name: 'Conversa com IA',
      icon: MessageCircle,
      component: VoiceChat
    },
    {
      id: 'expenses',
      name: 'Gastos e Entradas',
      icon: BarChart3,
      component: ExpenseTracker
    },
    {
      id: 'analysis',
      name: 'Análise de Gastos',
      icon: TrendingUp,
      component: ExpenseAnalysis
    },
    {
      id: 'text-chat',
      name: 'Chat de Texto',
      icon: Bot,
      component: TextChat
    }
  ]

  const ActiveComponent = tabs.find(tab => tab.id === activeTab)?.component

  return (
    <div className="min-h-screen bg-background text-foreground">
      {/* Mobile Header */}
      <div className="lg:hidden flex items-center justify-between p-4 border-b border-border">
        <img src={logo} alt="Me Poupei Me Poupei" className="h-8" />
        <Button
          variant="ghost"
          size="icon"
          onClick={() => setSidebarOpen(!sidebarOpen)}
        >
          {sidebarOpen ? <X className="h-5 w-5" /> : <Menu className="h-5 w-5" />}
        </Button>
      </div>

      <div className="flex">
        {/* Sidebar */}
        <div className={`
          fixed lg:static inset-y-0 left-0 z-50 w-64 bg-card border-r border-border transform transition-transform duration-200 ease-in-out
          ${sidebarOpen ? 'translate-x-0' : '-translate-x-full lg:translate-x-0'}
        `}>
          <div className="flex flex-col h-full">
            {/* Logo */}
            <div className="hidden lg:flex items-center justify-center p-6 border-b border-border">
              <img src={logo} alt="Me Poupei Me Poupei" className="h-10" />
            </div>

            {/* Navigation */}
            <nav className="flex-1 p-4 space-y-2">
              {tabs.map((tab) => {
                const Icon = tab.icon
                return (
                  <Button
                    key={tab.id}
                    variant={activeTab === tab.id ? "default" : "ghost"}
                    className="w-full justify-start gap-3 h-12"
                    onClick={() => {
                      setActiveTab(tab.id)
                      setSidebarOpen(false)
                    }}
                  >
                    <Icon className="h-5 w-5" />
                    {tab.name}
                  </Button>
                )
              })}
            </nav>

            {/* Footer */}
            <div className="p-4 border-t border-border">
              <p className="text-sm text-muted-foreground text-center">
                Assistente Financeiro IA
              </p>
            </div>
          </div>
        </div>

        {/* Overlay for mobile */}
        {sidebarOpen && (
          <div 
            className="fixed inset-0 bg-black/50 z-40 lg:hidden"
            onClick={() => setSidebarOpen(false)}
          />
        )}

        {/* Main Content */}
        <div className="flex-1 lg:ml-0">
          <main className="h-screen overflow-hidden">
            {ActiveComponent && <ActiveComponent />}
          </main>
        </div>
      </div>
    </div>
  )
}

export default App

