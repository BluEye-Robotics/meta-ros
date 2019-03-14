DESCRIPTION = "Message definitions for the Delphi SRR"
AUTHOR = "Josh Whitley"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/delphi_srr_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "8eff2197d04bf55ba5461b7c2a5df238"
SRC_URI[sha256sum] = "86a2a9e1e5dbdebd87011a95f0ae7b631a62638f0117a009a7f6159833a285e7"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-delphi_srr_msgs-2.3.1-0"

inherit catkin
