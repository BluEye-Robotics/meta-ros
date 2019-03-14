DESCRIPTION = "ROS Libraries for filtering specific kinds of laser scans"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "map-laser"

RDEPENDS_${PN} = "map-laser"

SRC_URI = "https://github.com/wu-robotics/laser_filtering_release/archive/release/melodic/laser_filtering/0.0.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "902da717920705306773602caa625ce8"
SRC_URI[sha256sum] = "d5aed79a7f8e17e1ffc7f9e88fa741a3d7d3a6134b822428cb8e0eab2326be62"

S = "${WORKDIR}/laser_filtering_release-release-melodic-laser_filtering-0.0.4-0"

inherit catkin
