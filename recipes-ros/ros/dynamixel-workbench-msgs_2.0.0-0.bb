DESCRIPTION = "This package includes ROS messages and services for dynamixel_workbench packages"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "message-generation std-msgs message-runtime"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-msgs-release/archive/release/melodic/dynamixel_workbench_msgs/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bcf52c65c839ad8e3dfd042222ffb7f2"
SRC_URI[sha256sum] = "f4d7567a8deb08fa914feb0d768f67ad855f1c9baf060734bbe593b6961e070f"

ROS_SPN = "dynamixel-workbench-msgs"
S = "${WORKDIR}/dynamixel-workbench-msgs-release-release-melodic-dynamixel_workbench_msgs-2.0.0-0"

inherit catkin
