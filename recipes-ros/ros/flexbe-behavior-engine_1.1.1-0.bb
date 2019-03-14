DESCRIPTION = "A meta-package to aggregate all the FlexBE packages"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "flexbe-core flexbe-input flexbe-mirror flexbe-msgs flexbe-onboard flexbe-states flexbe-testing flexbe-widget"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_behavior_engine/1.1.1-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "b5268a696fbc718167420c7c3f616d95"
SRC_URI[sha256sum] = "ba2eab7f7d934bdd7c34589630140c386b4f8ea5f206ac50189002658fb05160"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_behavior_engine-1.1.1-0"

inherit catkin
