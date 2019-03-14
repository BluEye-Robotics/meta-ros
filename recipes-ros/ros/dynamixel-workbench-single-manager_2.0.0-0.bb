DESCRIPTION = "This package is single manager for a Dynamixel. It provides a terminal environment to check the status of Dynamixel and control it before using Dynamixel"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp dynamixel-workbench-msgs dynamixel-workbench-toolbox"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/melodic/dynamixel_workbench_single_manager/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "bb202be1ce3721ad86671b631e8cc805"
SRC_URI[sha256sum] = "e57e19eec42aac4c1d0d81815d7b424bdbff962165452d2712423da09d74fbfc"

ROS_SPN = "dynamixel-workbench"
S = "${WORKDIR}/dynamixel-workbench-release-release-melodic-dynamixel_workbench_single_manager-2.0.0-0"

inherit catkin
