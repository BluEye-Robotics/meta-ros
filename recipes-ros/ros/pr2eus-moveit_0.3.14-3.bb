DESCRIPTION = "pr2eus_moveit"
AUTHOR = "YoheiKakiuchi"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "pr2eus moveit-msgs control-msgs roseus pr2eus moveit-msgs control-msgs roseus"

RDEPENDS_${PN} = "pr2eus moveit-msgs control-msgs roseus"

SRC_URI = "https://github.com/tork-a/jsk_pr2eus-release/archive/release/melodic/pr2eus_moveit/0.3.14-3.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "55d2484254b7593208144a41b856750a"
SRC_URI[sha256sum] = "94e4eea9aa6fad2ae767226e050f40e01790fba0afe0c0717ff9cf90bb218b1e"

ROS_SPN = "jsk_pr2eus"
S = "${WORKDIR}/jsk_pr2eus-release-release-melodic-pr2eus_moveit-0.3.14-3"

inherit catkin
