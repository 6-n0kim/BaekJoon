import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.LinkedList;
import java.util.Queue;
import java.util.StringTokenizer;

class Document {
	int index;
	int priority;

	public Document(int index, int priority) {
		this.index = index;
		this.priority = priority;
	}
}

public class Main {
	public static int findPrintOrder(Queue<Document> queue, int targetIdx) {
		int count = 0;
		while (!queue.isEmpty()) {
			Document currentDoc = queue.poll();
			int currentPriority = currentDoc.priority;

			// 나머지 문서들 중 중요도가 높은 문서가 있는지 확인
			boolean hasHigherPriority = queue.stream().anyMatch(doc -> doc.priority > currentPriority);

			if (hasHigherPriority) {
				// 현재 문서의 중요도가 가장 높지 않다면 다시 Queue의 뒤로 보내기
				queue.offer(currentDoc);
			} else {
				// 현재 문서의 중요도가 가장 높다면 인쇄
				count++;
				if (currentDoc.index == targetIdx) {
					return count;
				}
			}
		}
		return -1; // 예외 처리: 문서를 찾을 수 없는 경우
	}

	public static void main(String[] args) throws Exception {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		StringBuilder sb = new StringBuilder();
		int n = Integer.parseInt(br.readLine());
		StringTokenizer st;
		for (int i = 0; i < n; i++) {
			st = new StringTokenizer(br.readLine());
			int a = Integer.parseInt(st.nextToken());
			int b = Integer.parseInt(st.nextToken());
			st = new StringTokenizer(br.readLine());

			Queue<Document> queue = new LinkedList<>();
			for (int j = 0; j < a; j++) {
				queue.offer(new Document(j, Integer.parseInt(st.nextToken())));
			}
			int targetIdx = b; // 몇 번째로 인쇄되길 원하는 문서의 인덱스

			int result = findPrintOrder(queue, targetIdx);
			System.out.println(result);
		}
	}
}