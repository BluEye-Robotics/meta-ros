SRC_URI = "https://github.com/stonier/${ROS_SPN}/archive/${PV}.tar.gz;downloadfilename=${ROS_SP}.tar.gz"
SRC_URI[md5sum] = "490becfa572cb12ae6d9b0f7c4c4ffce"
SRC_URI[sha256sum] = "69d503109878e3a2c4f5be611fc9609078714899cae15fbf7f58119fdbd61e37"

S = "${WORKDIR}/${ROS_SP}/${ROS_BPN}"

inherit catkin

ROS_SPN = "ecl_core"
