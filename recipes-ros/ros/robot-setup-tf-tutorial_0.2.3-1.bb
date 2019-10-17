DESCRIPTION = "The robot_setup_tf_tutorial package"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "geometry-msgs roscpp tf geometry-msgs roscpp tf"

RDEPENDS_${PN} = "geometry-msgs roscpp tf"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/robot_setup_tf_tutorial/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "70e7f3f11a5c853c57cbf498fbb515ba"
SRC_URI[sha256sum] = "56636941f8a10861807e4cd860cf5c123247372f2f079f250aa2e26d0990000d"

ROS_SPN = "navigation_tutorials"
S = "${WORKDIR}/navigation_tutorials-release-release-melodic-robot_setup_tf_tutorial-0.2.3-1"

inherit catkin
