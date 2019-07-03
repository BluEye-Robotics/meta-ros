DESCRIPTION = "The driver_common stack contains classes and tools that are useful throughout the driver stacks. It currently contains: driver_base: A base class for sensors to provide a consistent state machine (retries, error handling, etc. ) and interface timestamp_tools: Classes to help timestamp hardware events"
AUTHOR = "Blaise Gassend"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=14;endline=14;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "driver-base timestamp-tools"

RDEPENDS_${PN} = "driver-base timestamp-tools"

SRC_URI = "https://github.com/ros-gbp/driver_common-release/archive/release/melodic/driver_common/1.6.8-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "491def89fa6f80a362d08eec8492b693"
SRC_URI[sha256sum] = "ea3516b1e1c6ad29343302b5c174ea896dc280f60800fe0c6d0e34e08b31d465"

S = "${WORKDIR}/driver_common-release-release-melodic-driver_common-1.6.8-0"

inherit catkin
