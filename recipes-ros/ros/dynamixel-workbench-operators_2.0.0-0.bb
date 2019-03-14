DESCRIPTION = "This package contains nodes that control the Dynamixel by communicating with the server registered in the 'dynamixel_workbench_controllers' package"
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp std-srvs geometry-msgs sensor-msgs trajectory-msgs cmake-modules yaml-cpp"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/melodic/dynamixel_workbench_operators/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "7919837fec0fb29907d1c1ade3bcb9a8"
SRC_URI[sha256sum] = "3b6f638d34a57d08365ca8029049067af23b0c8cbd185762ff4c2a65e07207f6"

ROS_SPN = "dynamixel-workbench"
S = "${WORKDIR}/dynamixel-workbench-release-release-melodic-dynamixel_workbench_operators-2.0.0-0"

inherit catkin
