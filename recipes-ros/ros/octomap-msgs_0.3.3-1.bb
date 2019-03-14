DESCRIPTION = "This package provides messages and serializations / conversion for the"
AUTHOR = "Armin Hornung"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=5ee5b8b046ae48ad94a2037ca953a67b"

DEPENDS = "message-generation geometry-msgs std-msgs geometry-msgs std-msgs message-runtime"

RDEPENDS_${PN} = "geometry-msgs std-msgs message-runtime"

SRC_URI = "https://github.com/ros-gbp/octomap_msgs-release/archive/release/melodic/octomap_msgs/0.3.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a70eaf55dd4bbae2c5bfde95b5b2d5f5"
SRC_URI[sha256sum] = "416e70d1633904e7a65bfcd4e1665e5ff5e013d8a9d6a53329d2a449c2002304"

S = "${WORKDIR}/octomap_msgs-release-release-melodic-octomap_msgs-0.3.3-1"

inherit catkin
