DESCRIPTION = "Translates joy msgs"
AUTHOR = "David V. Lu!!"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=7;endline=7;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "rospy sensor-msgs rospy sensor-msgs"

RDEPENDS_${PN} = "rospy sensor-msgs"

SRC_URI = "https://github.com/wu-robotics/wu_ros_tools/archive/release/melodic/joy_listener/0.2.4-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "653ea9f109e3dffde5ee418f3d677467"
SRC_URI[sha256sum] = "55b1bf4cf89b9ea2a405f878640a53c30f9205b7a328b88f2052629994e697f3"

ROS_SPN = "wu_ros_tools"
S = "${WORKDIR}/wu_ros_tools-release-melodic-joy_listener-0.2.4-0"

inherit catkin
