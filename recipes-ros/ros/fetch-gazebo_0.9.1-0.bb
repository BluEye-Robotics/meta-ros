DESCRIPTION = "Gazebo package for Fetch."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "angles gazebo-dev control-toolbox boost gazebo-plugins gazebo-ros robot-controllers robot-controllers-interface sensor-msgs"

RDEPENDS_${PN} = "actionlib control-msgs depth-image-proc fetch-description gazebo image-proc nodelet rgbd-launch trajectory-msgs xacro"

SRC_URI = "https://github.com/fetchrobotics-gbp/fetch_gazebo-release/archive/release/melodic/fetch_gazebo/0.9.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd52f874748cc528584b5fe4873cf1c5"
SRC_URI[sha256sum] = "5b623f04b2a527ddd0a1b7407a754a3bb2e024a68f0baee2452dd364f8a95e2f"

S = "${WORKDIR}/fetch_gazebo-release-release-melodic-fetch_gazebo-0.9.1-0"

inherit catkin
