DESCRIPTION = "Math toolkit for Yujin open control system. This package is intended to contain common use functions, mostly for simple mathematics but also for tf-related conversions. By no means it pretends to be an efficient and robust, widely used math library, but a play ground where to put common code that is typically repeated in many robot control programs."
AUTHOR = "Jorge Santos"
SECTION = "devel"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://package.xml;beginline=12;endline=12;md5=d566ef916e9dedc494f5f793a6690ba5"

DEPENDS = "ecl-build ecl-config ecl-exceptions ecl-formatters ecl-linear-algebra geometry-msgs roscpp tf ecl-build ecl-config ecl-exceptions ecl-formatters ecl-linear-algebra geometry-msgs roscpp tf"

RDEPENDS_${PN} = "ecl-build ecl-config ecl-exceptions ecl-formatters ecl-linear-algebra geometry-msgs roscpp tf"

SRC_URI = "https://github.com/yujinrobot-release/yujin_ocs-release/archive/release/melodic/yocs_math_toolkit/0.8.2-0.tar.gz;downloadfilename=${ROS_BPN}-${PV}.tar.gz"
SRC_URI[md5sum] = "3192d907e5e1c3560a13558cae9e3d41"
SRC_URI[sha256sum] = "53550a80b4e50074b5c5b15fe44f2d4e463ff9f768e6e662b7a7b3d65f2c32fd"

ROS_SPN = "yujin_ocs"
S = "${WORKDIR}/yujin_ocs-release-release-melodic-yocs_math_toolkit-0.8.2-0"

inherit catkin
