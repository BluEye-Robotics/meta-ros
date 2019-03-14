DESCRIPTION = "This package is composed of 'dynamixel_item', 'dynamixel_tool', 'dynamixel_driver' and 'dynamixel_workbench' class. The 'dynamixel_item' is saved as control table item and information of Dynamixels. The 'dynamixel_tool' class loads its by model number of Dynamixels. The 'dynamixel_driver' class includes wraped function used in DYNAMIXEL SDK. The 'dynamixel_workbench' class make simple to use Dynamixels"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp dynamixel-sdk"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/melodic/dynamixel_workbench_toolbox/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "cd4b62a8855b9297ce45fa983ffc0fdd"
SRC_URI[sha256sum] = "98a009c214814fb2ed6fe1b09590dab9503cd3e9fc6b5a9c5942ea7da8efcefb"

ROS_SPN = "dynamixel-workbench"
S = "${WORKDIR}/dynamixel-workbench-release-release-melodic-dynamixel_workbench_toolbox-2.0.0-0"

inherit catkin
