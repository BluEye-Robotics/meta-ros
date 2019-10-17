DESCRIPTION = "The point_cloud_publisher_tutorial package"
AUTHOR = "Eitan Marder-Eppstein"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "sensor-msgs roscpp sensor-msgs roscpp"

RDEPENDS_${PN} = "sensor-msgs roscpp"

SRC_URI = "https://github.com/ros-gbp/navigation_tutorials-release/archive/release/melodic/point_cloud_publisher_tutorial/0.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "0d4b8b41cfb0d547e10b4df5419e300d"
SRC_URI[sha256sum] = "0d214a51702c19e1fdfc493801baed7c5a4c23c3b543bd66f1b84500f300d96e"

ROS_SPN = "navigation_tutorials"
S = "${WORKDIR}/navigation_tutorials-release-release-melodic-point_cloud_publisher_tutorial-0.2.3-1"

inherit catkin
