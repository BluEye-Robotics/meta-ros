DESCRIPTION = "position_controllers"
AUTHOR = "Vijay Pradeep"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=10;endline=10;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "controller-interface forward-command-controller"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ros-gbp/ros_controllers-release/archive/release/melodic/position_controllers/0.15.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6d61885736973f9010dd45c687c6f6e6"
SRC_URI[sha256sum] = "4fc2790e75f82b2a202e46c7c851f61348aaf1f355f69cb940ead157d5e43368"

ROS_SPN = "ros_controllers"
S = "${WORKDIR}/ros_controllers-release-release-melodic-position_controllers-0.15.0-0"

inherit catkin
