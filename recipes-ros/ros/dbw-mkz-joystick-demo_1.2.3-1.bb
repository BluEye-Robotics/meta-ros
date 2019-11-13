DESCRIPTION = "Demonstration of drive-by-wire with joystick"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs dbw-mkz-msgs"

RDEPENDS_${PN} = "roslaunch joy dbw-mkz-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_joystick_demo/1.2.3-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7eb0a8e9d7c3eb438b5b53bbaf980c68"
SRC_URI[sha256sum] = "b758a37133992a0725348cc96d5abe0d462f7083892bed279a18d8751bcccf02"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_joystick_demo-1.2.3-1"

inherit catkin
