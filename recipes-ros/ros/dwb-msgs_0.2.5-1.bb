DESCRIPTION = "Message/Service definitions specifically for the dwb_local_planner"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation geometry-msgs nav-2d-msgs nav-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/DLu/robot_navigation-release/archive/release/melodic/dwb_msgs/0.2.5-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "98acc050d91b7b84b0677e3670cb2ee6"
SRC_URI[sha256sum] = "6427389e006d1d0e35080e805cf583355d40ad500fa4bcd8d365406e52fe41f3"

ROS_SPN = "robot_navigation"
S = "${WORKDIR}/robot_navigation-release-release-melodic-dwb_msgs-0.2.5-1"

inherit catkin
