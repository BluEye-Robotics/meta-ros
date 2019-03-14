DESCRIPTION = "Firmware source code for ArbotiX ROS bindings."
AUTHOR = "Michael Ferguson"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = ""

SRC_URI = "https://github.com/vanadiumlabs/arbotix_ros-release/archive/release/melodic/arbotix_firmware/0.10.0-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "6feccb1c1635d43e05ec44946849dd3c"
SRC_URI[sha256sum] = "c588a11ade8ae7118deec36d4619c9328a748439456671b39bb41fce43a8d382"

ROS_SPN = "arbotix"
S = "${WORKDIR}/arbotix_ros-release-release-melodic-arbotix_firmware-0.10.0-0"

inherit catkin
