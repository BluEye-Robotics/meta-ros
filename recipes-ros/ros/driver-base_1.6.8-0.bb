DESCRIPTION = "A framework for writing drivers that helps with runtime reconfiguration, diagnostics and self-test. This package is deprecated."
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=9;endline=9;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "message-generation roscpp self-test diagnostic-updater dynamic-reconfigure std-msgs message-runtime roscpp self-test diagnostic-updater dynamic-reconfigure std-msgs"

RDEPENDS_${PN} = "message-runtime roscpp self-test diagnostic-updater dynamic-reconfigure std-msgs"

SRC_URI = "https://github.com/ros-gbp/driver_common-release/archive/release/melodic/driver_base/1.6.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "4cd5488a38c58ae4406fbd71fc6ca9bc"
SRC_URI[sha256sum] = "8f279b3f0297b7798e82dd8d88949507d9dfa4dc58641d6c8d7ec66f65a70c19"

ROS_SPN = "driver_common"
S = "${WORKDIR}/driver_common-release-release-melodic-driver_base-1.6.8-0"

inherit catkin
