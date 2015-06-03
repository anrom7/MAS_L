Програма для демонстрації використання протоколів взаємодії модифікована наступним чином:
  - ContractNetInitiatorAgent замість dummy-action приймає в параметрах категорію дії і відправляє запит до ContractNetInitiatorAgent
  - ContractNetInitiatorAgent приймає в параметрах категорію, на яку він може відповісти пропозицією
  - якщо запит підходить, то ContractNetInitiatorAgent відправляє ContractNetInitiatorAgent відповідну пропозицію