package sec2;

import java.util.Map;		// map은 키(key)와 값(value)을 쌍으로 저장하고 있는 컬렉션프레임워크 자료구조이다.
							// {key:value}; => 예) {name : 조교행} name은 key, 조교행은 value
public class MultiTypeGeneric <K, V> implements Map.Entry<K, V> {
	private K key;
	private V value;
	
	@Override
	public K getKey() {
		return this.key;
	}
	
	@Override
	public V getValue() {
		return this.value;
	}

	@Override
	public V setValue(V value) {
		this.value = value;
		return value;
	}
}