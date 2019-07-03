DESCRIPTION = "Configuration and launch files to control the Desistek SAGA ROV"
AUTHOR = "Emre Ege"
SECTION = "devel"
LICENSE = "Apache-2.0"
LIC_FILES_CHKSUM = "file://package.xml;beginline=17;endline=17;md5=82f0323c08605e5b6f343b05213cf7cc"

DEPENDS = ""

RDEPENDS_${PN} = "uuv-control-cascaded-pid uuv-thruster-manager desistek-saga-description"

SRC_URI = "https://github.com/uuvsimulator/desistek_saga-release/archive/release/melodic/desistek_saga_control/0.3.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b0369b17db303597db55cf048d86dadf"
SRC_URI[sha256sum] = "81fe5ef7f2ef085fcb784c8799971f63dd8f145ea59a04902b1adc9f04eda688"

ROS_SPN = "desistek_saga"
S = "${WORKDIR}/desistek_saga-release-release-melodic-desistek_saga_control-0.3.2-0"

inherit catkin
