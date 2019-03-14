DESCRIPTION = "Demonstration of drive-by-wire with joystick"
AUTHOR = "Micho Radovnikovich"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "roscpp std-msgs sensor-msgs dbw-mkz-msgs"

RDEPENDS_${PN} = "roslaunch joy dbw-mkz-can"

SRC_URI = "https://github.com/DataspeedInc-release/dbw_mkz_ros-release/archive/release/melodic/dbw_mkz_joystick_demo/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "73dacb93ae3d77ebed3a7fa450a5d831"
SRC_URI[sha256sum] = "ee44e5172a5ab64274e3a62accbe5ed7206cf0d5fe5163b8c24ca857e082bc2e"

ROS_SPN = "dbw_mkz_ros"
S = "${WORKDIR}/dbw_mkz_ros-release-release-melodic-dbw_mkz_joystick_demo-1.1.1-0"

inherit catkin
