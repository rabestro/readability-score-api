package lv.id.jc.readability

import spock.lang.*

@Title("Sentences Separator")
@Narrative("""
    As a programmer
    I want to have a class that can split text into sentences
    So that I can use it in my readability application
""")
@Issue('RSG-4')
@See('https://en.wikipedia.org/wiki/Sentence_(linguistics)')
class SentencesSeparatorSpec extends Specification {

    @Subject
    def underTest = new SentenceSeparator()

    @PendingFeature
    def 'split text into sentences'() {

        expect: 'text is split into sentences'
        underTest.apply(text).toList() == sentences

        where: 'sentences are separated by a period, question mark, exclamation point, ellipsis, or newline'
        text                                              | sentences
        'This is a sentence.'                             | ['This is a sentence.']
        'This is a sentence. This is another sentence.'   | ['This is a sentence.', 'This is another sentence.']
        'This is a sentence! This is another sentence?'   | ['This is a sentence!', 'This is another sentence?']
        'This is a sentence? This is another sentence!'   | ['This is a sentence?', 'This is another sentence!']
        'This is a sentence... This is another sentence.' | ['This is a sentence...', 'This is another sentence.']
    }
}
