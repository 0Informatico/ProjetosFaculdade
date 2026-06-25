import { useState, useRef, useEffect } from 'react'
import { Card, CardContent, CardHeader, CardTitle } from '@/components/ui/card.jsx'
import { Button } from '@/components/ui/button.jsx'
import { Input } from '@/components/ui/input.jsx'
import { ScrollArea } from '@/components/ui/scroll-area.jsx'
import { Badge } from '@/components/ui/badge.jsx'
import { 
  Send, 
  Bot, 
  User, 
  Lightbulb, 
  TrendingUp, 
  PiggyBank, 
  Calculator,
  MessageSquare,
  Clock
} from 'lucide-react'

const TextChat = () => {
  const [messages, setMessages] = useState([
    {
      id: 1,
      type: 'bot',
      content: 'Olá! Sou seu assistente financeiro inteligente. Posso ajudá-lo com análises de gastos, dicas de economia, planejamento financeiro e muito mais. Como posso ajudá-lo hoje?',
      timestamp: new Date(),
      suggestions: [
        'Analisar meus gastos do mês',
        'Dicas para economizar',
        'Como investir R$ 1000?',
        'Planejar orçamento familiar'
      ]
    }
  ])
  const [inputValue, setInputValue] = useState('')
  const [isTyping, setIsTyping] = useState(false)
  const scrollAreaRef = useRef(null)

  // Respostas inteligentes baseadas em palavras-chave
  const getSmartResponse = (userMessage) => {
    const message = userMessage.toLowerCase()
    
    if (message.includes('gasto') || message.includes('despesa')) {
      return {
        content: 'Analisando seus gastos... Com base nos dados disponíveis, identifiquei que seus maiores gastos são: Moradia (38%), Alimentação (31%) e Transporte (21%). Posso sugerir algumas estratégias de otimização específicas para cada categoria.',
        suggestions: [
          'Como reduzir gastos com alimentação?',
          'Dicas para economizar no transporte',
          'Analisar gastos com moradia'
        ]
      }
    }
    
    if (message.includes('economizar') || message.includes('economia')) {
      return {
        content: 'Ótima pergunta! Baseado no seu perfil de gastos, aqui estão 3 dicas personalizadas: 1) Substitua 2 refeições por semana por opções caseiras (economia de ~R$120/mês), 2) Use transporte público 1x por semana (economia de ~R$60/mês), 3) Revise assinaturas não utilizadas (economia potencial de ~R$80/mês).',
        suggestions: [
          'Mais dicas de economia',
          'Como fazer um orçamento?',
          'Calcular economia anual'
        ]
      }
    }
    
    if (message.includes('investir') || message.includes('investimento')) {
      return {
        content: 'Para investimentos, primeiro é importante ter uma reserva de emergência. Com R$1000, sugiro: 60% em Tesouro Selic (baixo risco), 30% em CDB (renda fixa) e 10% para começar a estudar renda variável. Sempre considere seu perfil de risco e objetivos.',
        suggestions: [
          'Como criar reserva de emergência?',
          'Explicar tipos de investimento',
          'Calcular rendimento de investimentos'
        ]
      }
    }
    
    if (message.includes('orçamento') || message.includes('planejar')) {
      return {
        content: 'Vou ajudá-lo a criar um orçamento eficiente! A regra 50-30-20 é um bom começo: 50% para necessidades (moradia, alimentação), 30% para desejos (lazer, hobbies) e 20% para poupança/investimentos. Com base nos seus dados, você está gastando 62% em necessidades - vamos otimizar isso!',
        suggestions: [
          'Detalhar regra 50-30-20',
          'Criar meu orçamento personalizado',
          'Dicas para seguir o orçamento'
        ]
      }
    }
    
    // Resposta padrão
    return {
      content: 'Entendi sua pergunta! Com base nos seus dados financeiros e padrões de gastos, posso fornecer análises personalizadas e sugestões específicas. Você gostaria que eu analise algum aspecto específico das suas finanças?',
      suggestions: [
        'Analisar padrão de gastos',
        'Sugerir melhorias',
        'Explicar conceitos financeiros',
        'Criar plano de economia'
      ]
    }
  }

  const quickSuggestions = [
    { text: 'Resumo financeiro do mês', icon: TrendingUp },
    { text: 'Dicas de economia', icon: PiggyBank },
    { text: 'Calcular investimentos', icon: Calculator },
    { text: 'Planejar orçamento', icon: Lightbulb }
  ]

  const handleSendMessage = (messageText = inputValue) => {
    if (!messageText.trim()) return

    const newMessage = {
      id: messages.length + 1,
      type: 'user',
      content: messageText,
      timestamp: new Date()
    }

    setMessages(prev => [...prev, newMessage])
    setInputValue('')
    setIsTyping(true)

    // Simular resposta da IA
    setTimeout(() => {
      const response = getSmartResponse(messageText)
      const botResponse = {
        id: messages.length + 2,
        type: 'bot',
        content: response.content,
        timestamp: new Date(),
        suggestions: response.suggestions
      }
      setMessages(prev => [...prev, botResponse])
      setIsTyping(false)
    }, 1500)
  }

  const handleKeyPress = (e) => {
    if (e.key === 'Enter' && !e.shiftKey) {
      e.preventDefault()
      handleSendMessage()
    }
  }

  const handleSuggestionClick = (suggestion) => {
    handleSendMessage(suggestion)
  }

  // Auto-scroll para a última mensagem
  useEffect(() => {
    if (scrollAreaRef.current) {
      const scrollElement = scrollAreaRef.current.querySelector('[data-radix-scroll-area-viewport]')
      if (scrollElement) {
        scrollElement.scrollTop = scrollElement.scrollHeight
      }
    }
  }, [messages])

  return (
    <div className="h-full flex flex-col">
      {/* Header */}
      <div className="border-b border-border p-4">
        <div className="flex items-center gap-3">
          <div className="w-10 h-10 rounded-full bg-gradient-to-br from-primary/20 to-primary/40 flex items-center justify-center">
            <Bot className="h-5 w-5 text-primary" />
          </div>
          <div>
            <h1 className="text-xl font-semibold">Assistente Financeiro IA</h1>
            <p className="text-sm text-muted-foreground flex items-center gap-1">
              <div className="w-2 h-2 bg-green-500 rounded-full animate-pulse" />
              Online • Resposta inteligente ativada
            </p>
          </div>
        </div>
      </div>

      {/* Quick Suggestions */}
      <div className="p-4 border-b border-border">
        <p className="text-sm text-muted-foreground mb-2">Sugestões rápidas:</p>
        <div className="flex flex-wrap gap-2">
          {quickSuggestions.map((suggestion, index) => {
            const Icon = suggestion.icon
            return (
              <Button
                key={index}
                variant="outline"
                size="sm"
                className="text-xs h-8"
                onClick={() => handleSuggestionClick(suggestion.text)}
              >
                <Icon className="h-3 w-3 mr-1" />
                {suggestion.text}
              </Button>
            )
          })}
        </div>
      </div>

      {/* Messages */}
      <ScrollArea ref={scrollAreaRef} className="flex-1 p-4">
        <div className="space-y-4">
          {messages.map((message) => (
            <div
              key={message.id}
              className={`flex gap-3 ${message.type === 'user' ? 'flex-row-reverse' : ''}`}
            >
              <div className={`
                w-8 h-8 rounded-full flex items-center justify-center flex-shrink-0
                ${message.type === 'user' 
                  ? 'bg-primary text-primary-foreground' 
                  : 'bg-gradient-to-br from-primary/20 to-primary/40'
                }
              `}>
                {message.type === 'user' ? (
                  <User className="h-4 w-4" />
                ) : (
                  <Bot className="h-4 w-4 text-primary" />
                )}
              </div>
              
              <div className={`
                max-w-[80%] space-y-2
                ${message.type === 'user' ? 'items-end' : 'items-start'}
              `}>
                <div className={`
                  rounded-lg p-3 
                  ${message.type === 'user' 
                    ? 'bg-primary text-primary-foreground ml-auto' 
                    : 'bg-muted'
                  }
                `}>
                  <p className="text-sm whitespace-pre-wrap">{message.content}</p>
                </div>
                
                {/* Suggestions */}
                {message.suggestions && message.type === 'bot' && (
                  <div className="flex flex-wrap gap-1 mt-2">
                    {message.suggestions.map((suggestion, index) => (
                      <Button
                        key={index}
                        variant="ghost"
                        size="sm"
                        className="text-xs h-6 px-2 text-muted-foreground hover:text-foreground"
                        onClick={() => handleSuggestionClick(suggestion)}
                      >
                        {suggestion}
                      </Button>
                    ))}
                  </div>
                )}
                
                <div className="flex items-center gap-2">
                  <p className={`
                    text-xs opacity-70
                    ${message.type === 'user' ? 'text-primary-foreground' : 'text-muted-foreground'}
                  `}>
                    <Clock className="h-3 w-3 inline mr-1" />
                    {message.timestamp.toLocaleTimeString('pt-BR', { 
                      hour: '2-digit', 
                      minute: '2-digit' 
                    })}
                  </p>
                  {message.type === 'bot' && (
                    <Badge variant="outline" className="text-xs h-4">
                      IA
                    </Badge>
                  )}
                </div>
              </div>
            </div>
          ))}
          
          {/* Typing indicator */}
          {isTyping && (
            <div className="flex gap-3">
              <div className="w-8 h-8 rounded-full bg-gradient-to-br from-primary/20 to-primary/40 flex items-center justify-center">
                <Bot className="h-4 w-4 text-primary" />
              </div>
              <div className="bg-muted rounded-lg p-3">
                <div className="flex space-x-1">
                  <div className="w-2 h-2 bg-muted-foreground rounded-full animate-bounce" />
                  <div className="w-2 h-2 bg-muted-foreground rounded-full animate-bounce" style={{animationDelay: '0.1s'}} />
                  <div className="w-2 h-2 bg-muted-foreground rounded-full animate-bounce" style={{animationDelay: '0.2s'}} />
                </div>
              </div>
            </div>
          )}
        </div>
      </ScrollArea>

      {/* Input */}
      <div className="border-t border-border p-4">
        <div className="flex gap-2">
          <Input
            placeholder="Digite sua pergunta sobre finanças..."
            value={inputValue}
            onChange={(e) => setInputValue(e.target.value)}
            onKeyPress={handleKeyPress}
            className="flex-1"
          />
          <Button 
            onClick={() => handleSendMessage()} 
            size="icon"
            disabled={!inputValue.trim() || isTyping}
          >
            <Send className="h-4 w-4" />
          </Button>
        </div>
        <div className="flex items-center justify-between mt-2">
          <p className="text-xs text-muted-foreground">
            <MessageSquare className="h-3 w-3 inline mr-1" />
            Pergunte sobre orçamento, investimentos, economia ou análise de gastos
          </p>
          <Badge variant="outline" className="text-xs">
            {messages.filter(m => m.type === 'user').length} perguntas
          </Badge>
        </div>
      </div>
    </div>
  )
}

export default TextChat

