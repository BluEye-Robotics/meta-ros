DESCRIPTION = "Message definitions for the Delphi MRR"
AUTHOR = "Daniel Stanek"
SECTION = "devel"
LICENSE = "GPL-3.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=1e7b3bcc2e271699c77c769685058cbe"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/delphi_mrr_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "03ebd8ffd3a9a9e242342cf3dd901904"
SRC_URI[sha256sum] = "0f47230b42a53123e4f4a38eba9c775e8388bd3d04350273601fbe9988df40a6"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-delphi_mrr_msgs-2.3.1-0"

inherit catkin
