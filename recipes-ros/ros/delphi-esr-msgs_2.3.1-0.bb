DESCRIPTION = "Message definitions for the Delphi ESR"
AUTHOR = "Daniel Stanek"
SECTION = "devel"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://package.xml;beginline=6;endline=6;md5=58e54c03ca7f821dd3967e2a2cd1596e"

DEPENDS = "message-generation std-msgs"

RDEPENDS_${PN} = "message-runtime"

SRC_URI = "https://github.com/astuff/astuff_sensor_msgs-release/archive/release/melodic/delphi_esr_msgs/2.3.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "f70055b502af00e3d397dc561baaad03"
SRC_URI[sha256sum] = "72672fb148635e3f817ca5ee1c5b6374ab20470bd9275a8de72a87da26c25888"

ROS_SPN = "astuff_sensor_msgs"
S = "${WORKDIR}/astuff_sensor_msgs-release-release-melodic-delphi_esr_msgs-2.3.1-0"

inherit catkin
