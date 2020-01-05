package com.ship.match;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;
import javax.validation.constraints.NotNull;

import javax.persistence.GenerationType;

import org.springframework.stereotype.Component;

import lombok.AccessLevel;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Component
@Entity
@NoArgsConstructor(access = AccessLevel.PUBLIC)
@Getter
@Setter(AccessLevel.PROTECTED)
@ToString
@Table(name = "MATCH",
		uniqueConstraints = @UniqueConstraint(
				columnNames = {"MATCHID"}
				))
public class Match implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	@Column (name= "MATCHID") @NotNull private Long matchid;
	@Column (name= "STADIUMNAME",length = 64) @NotNull private String stadiumname;
	@Column (name= "MATCHINGNUMBER") @NotNull private int matchingnumber;
	@Column (name= "MATCHDATE") @NotNull private Long matchdate;
	
	@Builder
	private Match(Long matchid, String stadiumname,
			int matchingnumber, Long matchdate) {
		this.matchid = matchid;
		this.stadiumname = stadiumname;
		this.matchingnumber = matchingnumber;
		this.matchdate = matchdate;
	}
}


