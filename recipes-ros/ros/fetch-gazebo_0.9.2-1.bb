DESCRIPTION = "Gazebo package for Fetch."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles gazebo-dev control-toolbox boost gazebo-plugins gazebo-ros robot-controllers robot-controllers-interface sensor-msgs"

RDEPENDS_${PN} = "actionlib control-msgs depth-image-proc fetch-description gazebo image-proc nodelet rgbd-launch trajectory-msgs xacro"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo/0.9.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7e6e8ad18bcf51ef4e451377631f40f6"
SRC_URI[sha256sum] = "e368f635946556a5334f6daeef1d2ab3c2be880fa3429b71e14ccf15ec5814f1"

S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_gazebo-0.9.2-1"

inherit catkin
