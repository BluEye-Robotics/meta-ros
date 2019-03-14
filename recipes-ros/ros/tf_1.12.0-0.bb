DESCRIPTION = "tf is a package that lets the user keep track of multiple coordinateframes over time. tf maintains the relationship between coordinateframes in a tree structure buffered in time, and lets the usertransform points, vectors, etc between any two coordinate frames atany desired point in time."
AUTHOR = "Tully Foote"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=21;endline=21;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles geometry-msgs message-filters message-generation rosconsole roscpp rostime sensor-msgs std-msgs tf2-ros geometry-msgs  message-filters message-runtime rosconsole roscpp roswtf sensor-msgs std-msgs tf2-ros"

RDEPENDS_${PN} = "geometry-msgs  message-filters message-runtime rosconsole roscpp roswtf sensor-msgs std-msgs tf2-ros"

SRC_URI = "https://github.com/ros-gbp/geometry-release/archive/release/melodic/tf/1.12.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "caa1f9c0a8b4b3d1b6171bdc6c53b5be"
SRC_URI[sha256sum] = "00d706fa94be4c4348556e8985dae8be407e76aae3f767e92dbd35e206f5ab03"

ROS_SPN = "geometry"
S = "${WORKDIR}/geometry-release-release-melodic-tf-1.12.0-0"

inherit catkin
