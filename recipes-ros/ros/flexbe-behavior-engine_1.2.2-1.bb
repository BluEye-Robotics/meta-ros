DESCRIPTION = "A meta-package to aggregate all the FlexBE packages"
AUTHOR = ""
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=11;endline=11;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = ""

RDEPENDS_${PN} = "flexbe-core flexbe-input flexbe-mirror flexbe-msgs flexbe-onboard flexbe-states flexbe-testing flexbe-widget"

SRC_URI = "https://github.com/FlexBE/flexbe_behavior_engine-release/archive/release/melodic/flexbe_behavior_engine/1.2.2-1.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "9cf21afb04680b9d853602f8436485f1"
SRC_URI[sha256sum] = "f92a236be23a7556d107988e52fdde47cf251844cdd9eaa6d8c66f2f5a363472"

ROS_SPN = "flexbe"
S = "${WORKDIR}/flexbe_behavior_engine-release-release-melodic-flexbe_behavior_engine-1.2.2-1"

inherit catkin
