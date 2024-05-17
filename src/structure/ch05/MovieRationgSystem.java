package structure.ch05;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class MovieRationgSystem {

	public static void main(String[] args) {
		// Movie Object 계속 추가하는 자료구조
		ArrayList<Movie> movies = new ArrayList<Movie>();
		movies.add(new Movie("범죄도시 4 ", 5));
		movies.add(new Movie("기생충 ", 4));
		movies.add(new Movie("올드보이 ", 5));
		movies.add(new Movie("인생은 아름다워 ", 3));

		System.out.println(movies);

		for (Movie movie : movies) {
			System.out.println(movie.getTitle());
		}
		System.out.println("---------------------------");
		for (int i = 0; i < movies.size(); i++) {
			// 배열이 아님 --> get() 메서드 사용
			System.out.println(movies.get(i).getTitle());
		}

		// 어떤 데이터를 정렬을 하려면 정렬 알고리즘을 구형해서 기능을 만들어 주면 된다.
		// 버블 정렬, 퀵,.......

		Collections.sort(movies, new Comparator<Movie>() {
			@Override
			public int compare(Movie m1, Movie m2) {
				return Integer.compare(m2.getRationg(), m1.getRationg());
			}

		});

		System.out.println("--------------------------");

		// 평점 순으로 정렬된 영화 목록 출력
		for (Movie movie : movies) {
			System.out.println(movie);
		}

	}// end of main

}// end of class

class Movie {

	private String title;
	private int rationg;

	public Movie(String title, int rationg) {
		this.title = title;
		this.rationg = rationg;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", rationg=" + rationg + "]";
	}

	public String getTitle() {
		return title;
	}

	public int getRationg() {
		return rationg;
	}

}
