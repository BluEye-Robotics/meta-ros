DESCRIPTION = "This package contains examples of applying the 'dynamixel_workbench_toolbox' library developed on the basis of dynamixel_sdk to various operating modes of Dynamixel."
AUTHOR = "Darby Lim"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=8;endline=8;md5=3dce4ba60d7e51ec64f3c3dc18672dd3"

DEPENDS = "roscpp sensor-msgs geometry-msgs trajectory-msgs dynamixel-workbench-msgs dynamixel-workbench-toolbox cmake-modules yaml-cpp libeigen"

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/ROBOTIS-GIT-release/dynamixel-workbench-release/archive/release/melodic/dynamixel_workbench_controllers/2.0.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "a8857fbdb2b0794a9ec6a25975d477de"
SRC_URI[sha256sum] = "6a689760da538561f5481b327ee0f0c43fc49f3bc152b3fcfa51b406819ff40f"

ROS_SPN = "dynamixel-workbench"
S = "${WORKDIR}/dynamixel-workbench-release-release-melodic-dynamixel_workbench_controllers-2.0.0-0"

inherit catkin
